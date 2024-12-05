package com.studioscrossbar.mordhaumercs.ui.screens.mercbuild.overview

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.studioscrossbar.mordhaumercs.data.BuildListItem
import com.studioscrossbar.mordhaumercs.data.BuildRepository
import kotlinx.coroutines.launch
import okhttp3.internal.toImmutableList

class MercBuildOverviewViewModel(private val buildRepository : BuildRepository) : ViewModel() {

    private var _builds : List<BuildListItem> = mutableListOf()
    val builds = mutableStateOf(_builds.toImmutableList())

    init {
        fetchBuilds()
    }

    private fun fetchBuilds() {
        viewModelScope.launch {
            try {
                val response = buildRepository.getBuildsByPage(1)
                _builds = response
                builds.value = _builds.toImmutableList()
            } catch (e: Exception) {
                // Handle error
                e.printStackTrace()
            }
        }
    }

}