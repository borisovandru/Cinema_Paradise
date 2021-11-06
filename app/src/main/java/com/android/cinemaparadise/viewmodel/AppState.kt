package com.android.cinemaparadise.viewmodel

import com.android.cinemaparadise.model.Movie

sealed class AppState {
    // Добавил второй параметр-лист, для второго списка
    data class Success(val movieDataPlay: List<Movie>, val movieDataCome: List<Movie>) : AppState()
    data class Error(val error: Throwable) : AppState()
    object Loading : AppState()
}