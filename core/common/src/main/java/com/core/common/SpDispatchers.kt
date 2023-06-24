package com.core.common

import javax.inject.Qualifier

@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class Dispatcher(val spDispatcher: SpDispatchers)
enum class SpDispatchers {
    IO
}