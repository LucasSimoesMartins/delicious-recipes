package com.lucassimoesmartins.deliciousrecipes.ui.view

import android.content.Intent
import android.os.Bundle
import android.view.WindowManager
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.lucassimoesmartins.deliciousrecipes.R
import com.lucassimoesmartins.deliciousrecipes.database.AppDatabase
import com.lucassimoesmartins.deliciousrecipes.repository.Repository
import com.lucassimoesmartins.deliciousrecipes.ui.viewmodel.SplashViewModel
import com.lucassimoesmartins.deliciousrecipes.ui.viewmodel.factory.SplashViewModelFactory
import kotlinx.android.synthetic.main.activity_splash.*


class SplashActivity : AppCompatActivity() {

    private val viewModel by lazy {
        val repository = Repository(AppDatabase.getInstance(this).dao)
        val factory = SplashViewModelFactory(repository)
        ViewModelProvider(this, factory).get(SplashViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        supportActionBar?.hide()
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        configureSplash()
    }

    private fun configureSplash() {

        val animList = arrayListOf(
            R.raw.beer,
            R.raw.hamburger,
            R.raw.knife_and_fork,
            R.raw.milkshake,
            R.raw.pizza,
            R.raw.popsicle
        )

        val anim = animList[(0..animList.size).random()]
        lavSplash.setAnimation(anim)

        viewModel.getRecipesComplexSearch().observe(this, Observer { resource ->

            resource.data?.let {
                startActivity(Intent(this, QuickPreferencesActivity::class.java))
                finish()
            }

            resource.error?.let { errorMessage ->
                Toast.makeText(this, errorMessage, Toast.LENGTH_LONG).show()
            }
        })

    }
}
