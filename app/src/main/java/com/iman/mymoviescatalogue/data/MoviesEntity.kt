package com.iman.mymoviescatalogue.data

import java.util.*

data class MoviesEntity(
    var title: String,
    var release: String,
    var user_score: Int,
    var overview: String,
    var genre: String,
    var imagePath: Int
)