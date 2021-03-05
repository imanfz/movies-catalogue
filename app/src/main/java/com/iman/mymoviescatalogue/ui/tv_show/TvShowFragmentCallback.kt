package com.iman.mymoviescatalogue.ui.tv_show

import com.iman.mymoviescatalogue.data.MoviesEntity

interface TvShowFragmentCallback {
    fun onShareClick(movies: MoviesEntity)
}