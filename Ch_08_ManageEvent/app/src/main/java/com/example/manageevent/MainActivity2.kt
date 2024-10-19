package com.example.manageevent

import android.os.Bundle
import android.util.Log
import android.view.KeyEvent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        when (keyCode){
            KeyEvent.KEYCODE_BACK -> Log.d("kim","뒤로 가기")
            KeyEvent.KEYCODE_VOLUME_UP -> Log.d("kim","볼륨 업")
            KeyEvent.KEYCODE_VOLUME_DOWN -> Log.d("kim","볼륨 다운")

        }

        return super.onKeyDown(keyCode, event)
    }

    override fun onKeyUp(keyCode: Int, event: KeyEvent?): Boolean {
        Log.d("kim","onKeyUp")
        return super.onKeyUp(keyCode, event)
    }
}