package com.example.newsappmvvm.api

import com.example.newsappmvvm.models.NewsResponse
import com.example.newsappmvvm.utils.Constants.ApiKey
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewApi {

    @GET("v2/top-headlines")
    suspend fun getBreakingNews(
        @Query("country")
        countryCode: String = "us",
        @Query("page")
        pageNo: Int = 1,
        @Query("apiKey")
        apiKey: String = ApiKey
    ): Response<NewsResponse>

    @GET("v2/everything")
    suspend fun searchForNews(
        @Query("q")
        searchQuery: String,
        @Query("page")
        pageNo: Int = 1,
        @Query("apiKey")
        apiKey: String = ApiKey
    ): Response<NewsResponse>
}