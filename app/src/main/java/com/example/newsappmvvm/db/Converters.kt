package com.example.newsappmvvm.db

import androidx.room.TypeConverter
import com.example.newsappmvvm.models.Source

class Converters {

    @TypeConverter
    fun fromSource(source: Source) = source.name

    @TypeConverter
    fun toSource(name: String) = Source(name, name)
}