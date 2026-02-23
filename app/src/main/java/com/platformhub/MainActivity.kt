package com.platformhub

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.platformhub.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnTiktok.setOnClickListener {
            openWeb("https://www.tiktok.com")
        }

        binding.btnFacebook.setOnClickListener {
            openWeb("https://www.facebook.com")
        }

        binding.btnYoutube.setOnClickListener {
            openWeb("https://www.youtube.com")
        }

        binding.btnInstagram.setOnClickListener {
            openWeb("https://www.instagram.com")
        }

        binding.btnX.setOnClickListener {
            openWeb("https://www.x.com")
        }
    }

    private fun openWeb(url: String) {
        val intent = Intent(this, WebActivity::class.java)
        intent.putExtra("url", url)
        startActivity(intent)
    }
}
