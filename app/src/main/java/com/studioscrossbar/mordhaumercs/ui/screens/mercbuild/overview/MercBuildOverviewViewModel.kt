package com.studioscrossbar.mordhaumercs.ui.screens.mercbuild.overview

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.studioscrossbar.mordhaumercs.data.BuildListItem
import com.studioscrossbar.mordhaumercs.network.api.ApiClient
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class MercBuildOverviewViewModel : ViewModel() {
    private val _builds = MutableStateFlow<List<BuildListItem>>(emptyList())
    val builds : StateFlow<List<BuildListItem>> = _builds

    init {
        fetchBuilds()
    }

    private fun fetchBuilds() {
        viewModelScope.launch {
            try {
                val response = ApiClient.apiService.getBuildsByPage(1)
                println("Debugging here")
                println(response[0])
                _builds.value = response
            } catch (e: Exception) {
                // Handle error
                e.printStackTrace()
            }
        }
    }

}