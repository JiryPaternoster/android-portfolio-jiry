package com.studioscrossbar.mordhaumercs.ui.screens.mercbuild.overview

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import coil3.network.HttpException
import com.studioscrossbar.mordhaumercs.data.Build
import com.studioscrossbar.mordhaumercs.data.BuildListItem
import com.studioscrossbar.mordhaumercs.data.BuildRepository
import com.studioscrossbar.mordhaumercs.ui.helpers.UiState
import kotlinx.coroutines.launch
import okhttp3.internal.toImmutableList

class MercBuildOverviewViewModel(private val buildRepository : BuildRepository) : ViewModel() {

    private var _builds : List<BuildListItem> = mutableListOf()
    val builds = mutableStateOf(_builds.toImmutableList())
    var mercBuildOverviewUiState  = mutableStateOf<UiState<List<BuildListItem>>>(UiState.Loading)

    init {
        fetchBuilds()
    }

    private fun fetchBuilds() {
        viewModelScope.launch {
            try {
                mercBuildOverviewUiState.value = UiState.Loading
                val response = buildRepository.getBuildsByPage(1)
                _builds = response
                builds.value = _builds.toImmutableList()
                mercBuildOverviewUiState.value = UiState.Success(builds.value)
            } catch (e: HttpException){
                mercBuildOverviewUiState.value = UiState.Error("Http Error: $e.message")
                //TODO Use retry library here
                fetchBuilds()
            }
            catch (e: Exception) {
                mercBuildOverviewUiState.value = UiState.Error("Error: $e.message")
                //TODO Use retry library here
                fetchBuilds()
            }
        }
    }

}