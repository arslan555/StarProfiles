package com.core.common.result

import app.cash.turbine.test
import com.core.common.result.asResult
import com.core.common.result.Result
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.test.runTest
import org.junit.Assert
import org.junit.Assert.assertEquals
import org.junit.Test

class ResultTest {

    @Test
    fun testResult() = runTest {
        flow {
            emit(1)
            throw Exception("Test Done")
        }.asResult().test {
            assertEquals(Result.Loading, awaitItem())
            assertEquals(Result.Success(1), awaitItem())

            when (val errorResult = awaitItem()) {
                is Result.Error -> Assert.assertEquals(
                    "Test Done",
                    errorResult.exception?.message
                )
                Result.Loading,
                is Result.Success -> throw IllegalStateException(
                    "The flow should have emitted an Error Result"
                )
            }

            awaitComplete()
        }
    }
}