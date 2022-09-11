package com.example.domain.models

sealed class AttributeUiModel : UiAwareModel() {


    object Loading : AttributeUiModel()
    data class Success(val data: Attributes) : AttributeUiModel()
    data class Error(var error: String) : AttributeUiModel()
}