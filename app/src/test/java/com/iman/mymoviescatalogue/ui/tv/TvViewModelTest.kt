package com.iman.mymoviescatalogue.ui.tv

import org.junit.Before
import org.junit.Test

import org.junit.Assert.*

class TvViewModelTest {
    private lateinit var viewModel: TvViewModel

    @Before
    fun setUp() {
        viewModel = TvViewModel()
    }

    @Test
    fun getTvShow() {
        val tvEntities = viewModel.getTvShow()
        assertNotNull(tvEntities)
        assertEquals(10, tvEntities.size)
    }
}