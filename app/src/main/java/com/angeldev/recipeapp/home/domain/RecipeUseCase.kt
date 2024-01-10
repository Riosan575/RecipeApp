package com.angeldev.recipeapp.home.domain

import com.angeldev.recipeapp.home.data.RecipeRepository
import com.angeldev.recipeapp.home.data.network.response.Data

class RecipeUseCase {
    private val repository = RecipeRepository()

    suspend operator fun invoke(): List<Data>{
        return repository.getRecipe()
    }
}