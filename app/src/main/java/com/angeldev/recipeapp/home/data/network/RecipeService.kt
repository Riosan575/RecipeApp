package com.angeldev.recipeapp.home.data.network

import com.angeldev.recipeapp.core.network.RetrofitHelper
import com.angeldev.recipeapp.home.data.network.response.Data
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class RecipeService {
    private val retrofit = RetrofitHelper.getRetrofit()

    suspend fun getRecipe(): List<Data>{
        return withContext(Dispatchers.IO){
            val response = retrofit.create(RecipeClient::class.java).getRecipe()
            response.body()?.data ?: emptyList()
        }
    }
}