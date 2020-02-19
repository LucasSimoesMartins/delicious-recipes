package com.lucassimoesmartins.deliciousrecipes.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.lucassimoesmartins.deliciousrecipes.database.dao.RecipeDAO
import com.lucassimoesmartins.deliciousrecipes.model.Recipe
import com.lucassimoesmartins.deliciousrecipes.retrofit.webclient.WebClient

class Repository(
    private val dao: RecipeDAO,
    private val webClient: WebClient = WebClient()
) {
    fun getRecipesComplexSearch(): LiveData<Resource<Recipe>> {
        val mutableLiveData = MutableLiveData<Resource<Recipe>>()

        webClient.getRecipesComplexSearch(fun(recipe: Recipe?) {

            recipe?.let {
                mutableLiveData.value = Resource(data = it)
            }
        }, fun(errorMessage: String?) {
            mutableLiveData.value = Resource(data = null, error = errorMessage)
        })

        return mutableLiveData
    }
}