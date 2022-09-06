package com.anshdeep.kotlinmessenger.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/**
 * Created by aftab on 25/05/19.
 */
@Parcelize
data class User(
        val uid: String,
        val name: String,
        val profileImageUrl: String?
) : Parcelable {
    constructor() : this("", "", "")
}