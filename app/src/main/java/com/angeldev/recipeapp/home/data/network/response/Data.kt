package com.angeldev.recipeapp.home.data.network.response

data class Data(
    val description: String,
    val id: String,
    val image: String,
    val ingredients: List<String>,
    val name: String,
    val nutritions: List<String>,
    val preparation: String,
    val title: String
)