package com.example.domain.models

sealed class AttributeUiModel : UiAwareModel() {


    object Loading : AttributeUiModel()
    data class Success(val data: List<Attributes>) : AttributeUiModel()
    data class Error(var error: String) : AttributeUiModel()
}