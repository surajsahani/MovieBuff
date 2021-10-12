package com.martialcoder.moviebuff.data

import android.content.ContentProvider
import android.content.ContentValues
import android.database.Cursor
import android.net.Uri

class MoviesProvider {
    private var dbHelper: MoviesDbHelper? = null

    // removing content provider for now
//    override fun onCreate(): Boolean {
//        dbHelper = MoviesDbHelper(context)
//        return true
//    }

}