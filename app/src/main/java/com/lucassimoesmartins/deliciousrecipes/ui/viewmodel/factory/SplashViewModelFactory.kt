package com.lucassimoesmartins.deliciousrecipes.ui.viewmodel.factory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.lucassimoesmartins.deliciousrecipes.repository.Repository
import com.lucassimoesmartins.deliciousrecipes.ui.viewmodel.SplashViewModel

@Suppress("UNCHECKED_CAST")
class SplashViewModelFactory(
    private val repository: Repository
) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return SplashViewModel(repository) as T
    }
}