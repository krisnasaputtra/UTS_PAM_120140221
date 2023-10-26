package com.example.uts_pam_120140221.ui.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.uts_pam_120140221.R

class AuthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)

        supportActionBar?.hide()
    }
}