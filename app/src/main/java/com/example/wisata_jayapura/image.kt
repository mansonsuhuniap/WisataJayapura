package com.example.wisata_jayapura

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Image(
    val imageSrc : Int,
    val imageTitle : String,
    val imageDesc : String
): Parcelable
