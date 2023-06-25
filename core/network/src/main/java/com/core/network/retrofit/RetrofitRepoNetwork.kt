package com.core.network.retrofit

import com.core.network.ReposNetworkDataSource
import com.core.network.model.NetworkStarRepo
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.http.GET
import retrofit2.http.Query
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Retrofit API declaration for Github Repo Network API
 */
private interface RetrofitRepoNetworkApi {

    @GET(value = "search/repositories")
    suspend fun getStarRepos(
        @Query("q") language: String? = "language=kotlin+sort:stars",
    ): NetworkResponse<NetworkStarRepo>

}

private const val RepoBaseUrl = "https://api.github.com/"
/**
 * Wrapper for data provided from the [RepoBaseUrl]
 */
@Serializable
private data class NetworkResponse<T>(
    val data: T
)

/**
 * [Retrofit] backed [ReposNetworkDataSource]
 */
@Singleton
class RetrofitRepoNetwork @Inject constructor(
    networkJson: Json
) : ReposNetworkDataSource {

    private val networkApi = Retrofit.Builder()
        .baseUrl(RepoBaseUrl)
        .client(
            OkHttpClient
                .Builder()
                .addInterceptor(HttpLoggingInterceptor().apply {
                    setLevel(HttpLoggingInterceptor.Level.BODY)
                }
                )
                .build()
        )
        .addConverterFactory(networkJson.asConverterFactory("application/json".toMediaType()))
        .build()
        .create(RetrofitRepoNetworkApi::class.java)

    override suspend fun getStarRepos(language: String?): NetworkStarRepo  =
        networkApi.getStarRepos(language = language).data

}

