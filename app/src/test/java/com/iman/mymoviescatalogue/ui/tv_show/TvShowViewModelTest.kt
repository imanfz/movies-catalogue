package com.iman.mymoviescatalogue.ui.tv_show

import org.junit.Before
import org.junit.Test

import org.junit.Assert.*
import org.junit.Rule
import org.junit.rules.ExpectedException
import java.lang.AssertionError

class TvShowViewModelTest {
    private lateinit var showViewModel: TvShowViewModel

    @get:Rule
    var thrown = ExpectedException.none()

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

    @Test
    @Throws(AssertionError::class)
    fun getTvShowOutRange() {
        val moviesEntities = showViewModel.getTvShow()
        thrown.expect(AssertionError::class.java)
        thrown.expectMessage("expected:<11> but was:<10>")
        assertEquals(11, moviesEntities.size)
    }

    @Test
    @Throws(AssertionError::class)
    fun getTvShowTestNull() {
        val moviesEntities = showViewModel.getTvShow()
        thrown.expect(AssertionError::class.java)
        thrown.expectMessage("expected:<null> but was:<10>")
        assertEquals(null, moviesEntities.size)
    }

}