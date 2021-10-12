package com.martialcoder.moviebuff.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {

    override fun onResume() {
        super.onResume()
        var intent: Intent? = Intent(this, MainActivity::class.java)
        startActivity(intent);
        finish();
    }
}