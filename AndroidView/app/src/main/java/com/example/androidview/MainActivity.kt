package com.example.androidview

import android.graphics.Typeface
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.androidview.databinding.LinearTest1Binding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //이름 문자열 출력
        val name = TextView(this).apply {
            typeface = Typeface.DEFAULT_BOLD
            text = "최광림"
        }
        //이미지 출력
        val image = ImageView(this).also {
            it.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.ckl))
        }
        //특징 문자열
        val feature = TextView(this).apply {
            typeface = Typeface.DEFAULT_BOLD
            text = "존나 잘생김"
        }
        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER

            //객체에 글자,이미지,글자 뷰 넣기
            addView(name, WRAP_CONTENT, WRAP_CONTENT)
            addView(image, WRAP_CONTENT, WRAP_CONTENT)
            addView(feature, WRAP_CONTENT, WRAP_CONTENT)
        }
        val binding = LinearTest1Binding.inflate(layoutInflater)
        setContentView(binding.root)
        //layout객체를 화면에 출력
//        setContentView(layout)
        //xml파일을 출력할 경우
//        setContentView(R.layout.activity_main)
        //id값으로 뷰 객체 획득
//        val textView1: TextView = findViewById(R.id.text1)
        //코드에서 visibility 속성값 변경
        binding.visibleBtn.setOnClickListener{
            binding.targetView.visibility = View.VISIBLE
        }
        binding.invisibleBtn.setOnClickListener{
            binding.targetView.visibility = View.INVISIBLE
        }

    }
}