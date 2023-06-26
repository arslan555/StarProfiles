package com.core.data.di

import com.core.data.repository.StarReposRepository
import com.core.data.repository.StarReposRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface DataModule {

    @Binds
    fun bindsStarRepoRepository(
        starReposRepository: StarReposRepositoryImpl
    ): StarReposRepository
}