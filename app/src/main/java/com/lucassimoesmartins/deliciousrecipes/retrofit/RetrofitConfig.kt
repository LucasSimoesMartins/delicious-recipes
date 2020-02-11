package com.lucassimoesmartins.deliciousrecipes.retrofit

import com.lucassimoesmartins.deliciousrecipes.constants.Constants
import com.lucassimoesmartins.deliciousrecipes.retrofit.service.Service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitConfig {

    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val service: Service by lazy {
        retrofit.create(Service::class.java)
    }

}