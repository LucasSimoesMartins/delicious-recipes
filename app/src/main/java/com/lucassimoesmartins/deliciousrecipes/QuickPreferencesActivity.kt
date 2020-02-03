package com.lucassimoesmartins.deliciousrecipes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import kotlinx.android.synthetic.main.activity_quick_preferences.*

class QuickPreferencesActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quick_preferences)

        supportActionBar?.hide()
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)

        setUI()
    }

    private fun setUI() {
        btnPreferences.setOnClickListener(this)
    }

    override fun onClick(v: View?) {

        when(v?.id){
            R.id.btnPreferences -> {
                startActivity(Intent(this, PreferencesActivity::class.java))
            }
        }
    }
}
