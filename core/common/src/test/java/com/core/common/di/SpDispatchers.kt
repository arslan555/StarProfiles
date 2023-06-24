package com.core.common.di

import javax.inject.Qualifier


@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class Dispatcher(val spDispatchers: SpDispatchers)

enum class SpDispatchers {
    IO
}
