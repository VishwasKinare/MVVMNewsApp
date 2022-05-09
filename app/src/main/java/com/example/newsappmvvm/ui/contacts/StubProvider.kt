package com.example.newsappmvvm.ui.contacts

import android.content.ContentProvider
import android.content.ContentValues
import android.database.Cursor
import android.net.Uri

/*
 * Define an implementation of ContentProvider that stubs out
 * all methods
 */
class StubProvider : ContentProvider() {
    /*
     * Always return true, indicating that the
     * provider loaded correctly.
     */
    override fun onCreate(): Boolean  = true

    /*
     * Return no type for MIME type
     */
    override fun getType(uri: Uri): String?  = null

    /*
     * query() always returns no results
     *
     */
    override fun query(
        p0: Uri,
        p1: Array<out String>?,
        p2: String?,
        p3: Array<out String>?,
        p4: String?
    ): Cursor? = null

    /*
     * insert() always returns null (no URI)
     */
    override fun insert(p0: Uri, p1: ContentValues?): Uri? = null

    /*
     * delete() always returns "no rows affected" (0)
     */
    override fun delete(p0: Uri, p1: String?, p2: Array<out String>?): Int = 0

    /*
     * update() always returns "no rows affected" (0)
     */
    override fun update(p0: Uri, p1: ContentValues?, p2: String?, p3: Array<out String>?): Int = 0
}
