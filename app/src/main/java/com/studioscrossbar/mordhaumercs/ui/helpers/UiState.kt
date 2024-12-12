package com.studioscrossbar.mordhaumercs.ui.helpers

sealed class UiState<out T> {
    data class Success<T>(val data: T) : UiState<T>()
    data class Error(val exception: String) : UiState<Nothing>()
    data object Loading : UiState<Nothing>()
}


