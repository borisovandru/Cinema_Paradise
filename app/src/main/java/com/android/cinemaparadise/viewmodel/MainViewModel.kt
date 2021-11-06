package com.android.cinemaparadise.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.android.cinemaparadise.model.Repository
import com.android.cinemaparadise.model.RepositoryImpl
import java.lang.Thread.sleep

class MainViewModel(
    private val liveDataToObserve: MutableLiveData<AppState> = MutableLiveData(),
    private val repositoryImpl: Repository = RepositoryImpl()
) : ViewModel() {

    // Получаем данные
    fun getLiveData() = liveDataToObserve

    fun getDataFromLocalSource() {
        liveDataToObserve.value = AppState.Loading
        Thread {
            sleep(1000)
            liveDataToObserve.postValue(
                AppState.Success(
                    repositoryImpl.getNowPlayingFromLocalStorage(),
                    repositoryImpl.getUpcomingFromLocalStorage()
                )
            )
        }.start()
    }
}