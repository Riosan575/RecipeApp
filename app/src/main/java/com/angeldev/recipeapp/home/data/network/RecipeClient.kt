package com.angeldev.recipeapp.home.data.network

import com.angeldev.recipeapp.home.data.network.response.RecipeResponse
import retrofit2.Response
import retrofit2.http.GET

interface RecipeClient {
    @GET("recipe/recipes")
    suspend fun getRecipe(): Response<RecipeResponse>
}