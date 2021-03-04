package com.iman.mymoviescatalogue.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class MoviesEntity(
    var title: String,
    var release: String,
    var user_score: Int,
    var overview: String,
    var genre: String,
    var imagePath: Int
) : Parcelable