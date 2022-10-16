package com.example.week5_0706012110016.repository

import com.example.week5_0706012110016.retrovit.EndPointApi
import javax.inject.Inject

class MoviesRepository @Inject constructor(private val api: EndPointApi) {
    suspend fun getNowPlayingData(
        apiKey: String,
        language: String,
        page: Int
    ) =
        api.getNowPlaying(apiKey, language, page)

    suspend fun getMovieDetailResult(
        apiKey: String,
        movieId: Int
    ) = api.getMovieDetails(movieId, apiKey)
}