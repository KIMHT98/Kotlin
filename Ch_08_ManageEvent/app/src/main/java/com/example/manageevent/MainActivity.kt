package com.example.manageevent

import android.os.Bundle
import android.util.Log
import android.view.KeyEvent
import android.view.MotionEvent
import android.widget.CompoundButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.manageevent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        
        binding.checkbox.setOnCheckedChangeListener(object : CompoundButton.OnCheckedChangeListener{
            override fun onCheckedChanged(buttonView: CompoundButton?, isChecked: Boolean) {
                Log.d("kim","체크박스 클릭")
            }
        })
        binding.button.setOnClickListener{
            Log.d("kim","클릭 이벤트")
        }
        binding.button.setOnLongClickListener{
            Log.d("kim","롱클릭 이벤트")
            true
        }




}
    override fun onTouchEvent(event: MotionEvent?): Boolean {
        when(event?.action){
            MotionEvent.ACTION_DOWN -> {
                Log.d("Kim","Touch down event")
                Log.d("positionX","x : ${event.x}, rawX : ${event.rawX}")
                Log.d("positionY","y : ${event.y}, rawY : ${event.rawY}")

            }
            MotionEvent.ACTION_UP -> {
                Log.d("Kim","Touch up event")
            }
        }
        return super.onTouchEvent(event)
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