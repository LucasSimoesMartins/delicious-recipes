package com.lucassimoesmartins.deliciousrecipes.retrofit.webclient

import com.lucassimoesmartins.deliciousrecipes.constants.Constants
import com.lucassimoesmartins.deliciousrecipes.model.Recipe
import com.lucassimoesmartins.deliciousrecipes.retrofit.RetrofitConfig
import com.lucassimoesmartins.deliciousrecipes.retrofit.service.Service
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class WebClient(
    private val service: Service = RetrofitConfig().service
) {

    private fun <T> sendRequest(
        call: Call<T>,
        success: (response: T?) -> Unit,
        failure: (error: String?) -> Unit
    ) {
        call.enqueue(object : Callback<T> {
            override fun onResponse(
                call: Call<T>, response: Response<T>
            ) {
                if (response.isSuccessful) {
                    success(response.body())
                } else {
                    failure(Constants.GENERIC_FAIL_MESSAGE)
                }
            }

            override fun onFailure(call: Call<T>, t: Throwable) {
                failure(t.message)
            }
        })
    }

    fun getRecipesComplexSearch(
        success: (response: Recipe?) -> Unit,
        failure: (error: String?) -> Unit
    ) {
        sendRequest(
            service.getRecipesComplexSearch(query = "potato"),
            success,
            failure
        )
    }

}