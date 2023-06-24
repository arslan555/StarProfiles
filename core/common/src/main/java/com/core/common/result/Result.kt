package com.core.common.result

import kotlinx.coroutines.flow.Flow


sealed interface Result<out T> {
    data class Success<T>(val data: T) : Result<T>
    data class Error(val exception: Throwable? = null) : Result<Nothing>
    object Loading : Result<Nothing>
}

fun <T> Flow<T>.asResult(): Flow<Result<T>> {
    return  Result.Loading as Flow<Result<T>>
}