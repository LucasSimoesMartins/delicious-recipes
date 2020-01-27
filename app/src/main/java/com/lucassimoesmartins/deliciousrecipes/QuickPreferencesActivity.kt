package com.lucassimoesmartins.deliciousrecipes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager

class QuickPreferencesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quick_preferences)

        supportActionBar?.hide()
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
    }
}
