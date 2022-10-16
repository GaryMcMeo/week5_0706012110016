package com.example.week5_0706012110016.model

data class Upcoming(
    val dates: Dates,
    val page: Int,
    val results: List<UpcomingResult>,
    val total_pages: Int,
    val total_results: Int
)