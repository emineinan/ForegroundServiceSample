package com.example.foregroundservices_notification

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.foregroundservices_notification.databinding.ActivityMainBinding
import com.example.foregroundservices_notification.service.SampleService

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonStart.setOnClickListener {
            SampleService.startService(this, "Foreground Service is running.")
            Toast.makeText(this, "Service started.", Toast.LENGTH_SHORT).show()
        }

        binding.buttonStop.setOnClickListener {
            SampleService.stopService(this)
            Toast.makeText(this, "Service stopped.", Toast.LENGTH_SHORT).show()
        }
    }
}