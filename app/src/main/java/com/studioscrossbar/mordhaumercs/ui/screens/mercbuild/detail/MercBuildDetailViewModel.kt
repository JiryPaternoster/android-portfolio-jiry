package com.studioscrossbar.mordhaumercs.ui.screens.mercbuild.detail

import android.content.ClipboardManager
import android.content.Context
import androidx.compose.runtime.mutableStateOf
import androidx.core.content.ContextCompat.getSystemService
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import coil3.network.HttpException
import com.studioscrossbar.mordhaumercs.data.Build
import com.studioscrossbar.mordhaumercs.data.BuildRepository
import com.studioscrossbar.mordhaumercs.ui.helpers.UiState
import kotlinx.coroutines.launch


class MercBuildDetailViewModel(private val buildRepository: BuildRepository, private val buildId : Int) : ViewModel() {

    private val _build : Build? = null;
    val build = mutableStateOf(_build)
    var mercBuildDetailUiState = mutableStateOf<UiState<Build>>(UiState.Loading)

    init {
        fetchBuild()
    }

    private fun fetchBuild() {
        viewModelScope.launch {
            try {
                mercBuildDetailUiState.value = UiState.Loading
                val response = buildRepository.getBuildById(buildId)
                build.value = response
                mercBuildDetailUiState.value = UiState.Success(response)
            }catch (e: HttpException){
                mercBuildDetailUiState.value = UiState.Error("Http Error: $e.message")
                //TODO Use retry library here
                fetchBuild()
            }
            catch (e: Exception) {
                mercBuildDetailUiState.value = UiState.Error("Error: $e.message")
                //TODO Use retry library here
                fetchBuild()
            }

        }
    }


    fun copyConfigLinesToClipboard(){
        // TODO
    }

}