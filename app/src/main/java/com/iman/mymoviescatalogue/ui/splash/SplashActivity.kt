package com.iman.mymoviescatalogue.ui.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.iman.mymoviescatalogue.R
import com.iman.mymoviescatalogue.databinding.ActivitySplashBinding
import com.iman.mymoviescatalogue.ui.main.MainActivity

class SplashActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySplashBinding
    var sleep = 2 * 1000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        launchApp()
    }

    private fun launchApp() {
        val background: Thread = object : Thread() {
            override fun run() {
                try {
                    sleep(sleep.toLong())
                    val intent = Intent(applicationContext, MainActivity::class.java)
                    startActivity(intent)
                    finish()
                } catch (ignored: Exception) {

                }
            }
        }

        // start thread
        background.start()
    }
}