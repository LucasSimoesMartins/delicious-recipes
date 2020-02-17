package com.lucassimoesmartins.deliciousrecipes.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.lucassimoesmartins.deliciousrecipes.model.Recipe
import com.lucassimoesmartins.deliciousrecipes.repository.Repository
import com.lucassimoesmartins.deliciousrecipes.repository.Resource

class SplashViewModel(
    private val repository: Repository
) : ViewModel() {

    fun getRecipesComplexSearch(): LiveData<Resource<Recipe>> {
        return repository.getRecipesComplexSearch()
    }

}