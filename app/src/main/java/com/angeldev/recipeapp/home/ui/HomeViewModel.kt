package com.angeldev.recipeapp.home.ui

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.angeldev.recipeapp.home.data.network.response.Data
import com.angeldev.recipeapp.home.domain.RecipeUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class HomeViewModel: ViewModel() {

    private val recipeUseCase = RecipeUseCase()
    private val _data = MutableStateFlow<List<Data>>(emptyList())
    val data: StateFlow<List<Data>> = _data.asStateFlow()

    init {
        getRecipes()
    }

    private fun getRecipes(){
        viewModelScope.launch {
            val result = recipeUseCase()

            if (result.isNotEmpty()){
                _data.value = result
                Log.i("angel", "este es el resultado ${_data.value}")
            }
        }
    }
}