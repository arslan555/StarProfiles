package com.core.network.fake

import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.runTest
import kotlinx.serialization.json.Json
import org.junit.Assert.*
import org.junit.Before

import org.junit.Test

class FakeReposNetworkDataSourceTest {

    private lateinit var subject: FakeReposNetworkDataSource

    private val testDispatchers = StandardTestDispatcher()

    @Before
    fun setUp() {
        subject = FakeReposNetworkDataSource(
            ioDispatcher = testDispatchers,
            networkJson = Json { ignoreUnknownKeys = true }
            )
    }

    @Test
    fun testDeserializationOfRepos()  = runTest(testDispatchers) {
        assertNotNull( subject.getStarRepos())
        assertEquals(FakeDataSource.sampleRepos.items?.size, subject.getStarRepos().items?.size)
        assertEquals(FakeDataSource.sampleRepos.total_count, subject.getStarRepos().total_count)
        assertEquals(FakeDataSource.sampleRepos.items?.get(0)?.name, subject.getStarRepos().items?.get(0)?.name)
        assertEquals(FakeDataSource.sampleRepos.items?.get(1)?.topics?.get(5), subject.getStarRepos().items?.get(0)?.topics?.get(5))
    }



}