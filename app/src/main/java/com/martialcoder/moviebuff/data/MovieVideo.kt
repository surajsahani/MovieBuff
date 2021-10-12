package com.martialcoder.moviebuff.data

import android.os.Parcel
import android.os.Parcelable

class MovieVideo() : Parcelable {
    constructor(parcel: Parcel) : this() {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<MovieVideo> {
        override fun createFromParcel(parcel: Parcel): MovieVideo {
            return MovieVideo(parcel)
        }

        override fun newArray(size: Int): Array<MovieVideo?> {
            return arrayOfNulls(size)
        }
    }
}