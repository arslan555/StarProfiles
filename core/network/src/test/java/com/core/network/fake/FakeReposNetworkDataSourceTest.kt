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
        assertEquals(FakeDataSource.sampleRepos.items?.size, 2)
        assertEquals(FakeDataSource.sampleRepos.total_count, 3558)
        assertEquals(FakeDataSource.sampleRepos.items?.get(0)?.name, "kotlin")
        assertEquals(FakeDataSource.sampleRepos.items?.get(1)?.topics?.get(5), "programming-language")
    }



}