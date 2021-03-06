package com.android.cinemaparadise.model

import java.util.*

class RepositoryImpl : Repository {
    //Воспользуемся преимуществами языка
    override fun getMoviesFromServer() = Movie(
        "Фильм из сервера", "Movie Server", Calendar.getInstance().time
    )

    override fun getNowPlayingFromLocalStorage() = getNowPlayingMovies()
    override fun getUpcomingFromLocalStorage() = getUpcomingMovies()
}