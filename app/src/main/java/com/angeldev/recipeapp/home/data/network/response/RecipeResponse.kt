package com.angeldev.recipeapp.home.data.network.response

import com.google.gson.annotations.SerializedName

data class RecipeResponse(
    @SerializedName("data") val data: List<Data>,
    @SerializedName("response") val response: String
)