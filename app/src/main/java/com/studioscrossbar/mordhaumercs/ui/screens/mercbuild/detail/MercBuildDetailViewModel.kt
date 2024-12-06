package com.studioscrossbar.mordhaumercs.ui.screens.mercbuild.detail

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.studioscrossbar.mordhaumercs.data.Build
import com.studioscrossbar.mordhaumercs.data.BuildRepository
import kotlinx.coroutines.launch

class MercBuildDetailViewModel(private val buildRepository: BuildRepository, private val buildId : Int) : ViewModel() {

    private val _build : Build? = null;
    val build = mutableStateOf(_build)


    init {
        fetchBuild()
    }

    private fun fetchBuild() {
        viewModelScope.launch {
            try {
                val response = buildRepository.getBuildById(buildId)
                println("Build ID Here: $buildId")
                build.value = response
            } catch (e: Exception) {
                // Handle error
                e.printStackTrace()
            }
        }
    }

}