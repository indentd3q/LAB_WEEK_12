package com.example.lab_week_12.api

import com.example.lab_week_12.model.PopularMoviesResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieService {
    @GET("movie/popular")
    // here, we are using the suspend keyword to indicate that this function is a coroutine
    // suspended functions can be paused and resumed at a later time
    // this is useful for network calls, since they can take a long time to complete
    // and we don't want to block the main thread
    // for more info, see: https://kotlinlang.org/docs/reference/coroutines/basics.html
    suspend fun getPopularMovies(
        @Query("api_key") apiKey: String
    ): PopularMoviesResponse
}