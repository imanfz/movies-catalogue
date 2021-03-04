package com.iman.mymoviescatalogue.ui.tv

import org.junit.Before
import org.junit.Test

import org.junit.Assert.*

class TvShowViewModelTest {
    private lateinit var showViewModel: TvShowViewModel

    @Before
    fun setUp() {
        showViewModel = TvShowViewModel()
    }

    @Test
    fun getTvShow() {
        val tvEntities = showViewModel.getTvShow()
        assertNotNull(tvEntities)
        assertEquals(10, tvEntities.size)
    }
}