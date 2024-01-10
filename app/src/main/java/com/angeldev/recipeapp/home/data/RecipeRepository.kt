package com.angeldev.recipeapp.home.data

import com.angeldev.recipeapp.home.data.network.RecipeService
import com.angeldev.recipeapp.home.data.network.response.Data

class RecipeRepository {

    private val api = RecipeService()

    suspend fun getRecipe(): List<Data>{
        return api.getRecipe()
    }
}