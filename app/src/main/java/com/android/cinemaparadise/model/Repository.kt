package com.android.cinemaparadise.model

interface Repository {
    fun getMoviesFromServer(): Movie
    fun getNowPlayingFromLocalStorage(): List<Movie>
    fun getUpcomingFromLocalStorage(): List<Movie>
}