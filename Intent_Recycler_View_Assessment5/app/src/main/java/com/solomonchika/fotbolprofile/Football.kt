package com.oghenovo.fotbolprofile

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Football(
    val imageSrc : Int,
    val firstName: String,
    val lastName : String
) : Parcelable
