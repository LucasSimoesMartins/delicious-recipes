package com.lucassimoesmartins.deliciousrecipes.ui.view

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.lucassimoesmartins.deliciousrecipes.R
import kotlinx.android.synthetic.main.activity_splash.*


class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        supportActionBar?.hide()
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)

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

        val handle = Handler()
        handle.postDelayed({
            startActivity(Intent(this, QuickPreferencesActivity::class.java))
        },3000)
    }
}
