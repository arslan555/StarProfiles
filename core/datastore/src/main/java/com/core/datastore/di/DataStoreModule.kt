package com.core.datastore.di
import android.content.Context
import androidx.datastore.preferences.preferencesDataStore
import com.core.datastore.DataStoreUtil
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent



@Module
@InstallIn(SingletonComponent::class)
object DataStoreModule {
    @Provides
    fun provideDataStoreUtil(@ApplicationContext context: Context): DataStoreUtil {
        return DataStoreUtil(context)
    }
}