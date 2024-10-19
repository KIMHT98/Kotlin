package com.example.layout

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.layout.databinding.FrameLayoutBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = FrameLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener{
            binding.button.visibility = View.INVISIBLE
            binding.imageView.visibility = View.VISIBLE
        }
        binding.imageView.setOnClickListener{
            binding.button.visibility = View.VISIBLE
            binding.imageView.visibility = View.INVISIBLE
        }
    }
}