package com.angeldev.recipeapp.core.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {
    fun getRetrofit(): Retrofit{
        return Retrofit.Builder()
            .baseUrl("http://recipe-api.somee.com/api/v1/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}