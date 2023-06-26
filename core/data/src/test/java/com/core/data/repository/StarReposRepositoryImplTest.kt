package com.core.data.repository

import com.core.data.testdoubles.TestReposNetworkDataSource
import com.core.model.data.StarRepos
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Before

import org.junit.Test

class StarReposRepositoryImplTest {
    private lateinit var subject: StarReposRepositoryImpl
    private lateinit var network: TestReposNetworkDataSource

    @Before
    fun setup() {
        network = TestReposNetworkDataSource()
        subject = StarReposRepositoryImpl(network)
    }


    @Test
    fun getStarReposStream_Success() = runTest {
        val starRepos: List<StarRepos> = subject.getStarReposStream().first()
        assertNotNull(starRepos)
        assertEquals(2, starRepos.size)
        assertEquals("kotlin", starRepos[0].name)
        assertEquals("Bandhook-Kotlin", starRepos[1].name)
    }
}