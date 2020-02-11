package com.lucassimoesmartins.deliciousrecipes.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.lucassimoesmartins.deliciousrecipes.R
import com.lucassimoesmartins.deliciousrecipes.repository.Repository
import com.lucassimoesmartins.deliciousrecipes.ui.viewmodel.QuickPreferencesViewModel
import com.lucassimoesmartins.deliciousrecipes.ui.viewmodel.factory.QuickPreferencesViewModelFactory
import kotlinx.android.synthetic.main.activity_quick_preferences.*

class QuickPreferencesActivity : AppCompatActivity(), View.OnClickListener {

    private val viewModel by lazy {
        val repository = Repository()
        val factory = QuickPreferencesViewModelFactory(repository)
        ViewModelProvider(this, factory).get(QuickPreferencesViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quick_preferences)

        supportActionBar?.hide()
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        setUI()
    }

    private fun setUI() {
        btnPreferences.setOnClickListener(this)
    }

    override fun onClick(v: View?) {

        when (v?.id) {
            R.id.btnPreferences -> {
//                startActivity(Intent(this, PreferencesActivity::class.java))

                viewModel.getRecipesComplexSearch().observe(this, Observer {
                    it?.let {
                        var a = 1
                    }
                })


            }
        }
    }
}
