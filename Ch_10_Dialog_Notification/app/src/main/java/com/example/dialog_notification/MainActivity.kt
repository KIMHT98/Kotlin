package com.example.dialog_notification

import android.app.DatePickerDialog
import android.app.ProgressDialog.show
import android.app.TimePickerDialog
import android.content.Context
import android.content.DialogInterface
import android.media.MediaPlayer
import android.media.RingtoneManager
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.os.Vibrator
import android.os.VibratorManager
import android.util.Log
import android.view.KeyEvent
import android.widget.DatePicker
import android.widget.TimePicker
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.dialog_notification.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //뒤로 가기 버튼을 누른 시각을 저장
    var initTime = 0L
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        DatePickerDialog(this, object: DatePickerDialog.OnDateSetListener{
            override  fun onDateSet(p0: DatePicker?, p1: Int, p2:Int, p3: Int){
                Log.d("kim","year: $p1, month ${p2+1}, dayOfMonth: $p3")
            }
        },2024,4,12).show()

        TimePickerDialog(this, object: TimePickerDialog.OnTimeSetListener{
            override fun onTimeSet(p0: TimePicker?, p1: Int, p2: Int) {
                Log.d("kim","time: $p1, minute: $p2")
            }
        },15, 0, true).show()
        val eventHandler = object : DialogInterface.OnClickListener{
            override fun onClick(dialog: DialogInterface?, which: Int) {
                if(which == DialogInterface.BUTTON_POSITIVE){
                    Log.d("kim","positive")
                }else if(which == DialogInterface.BUTTON_NEGATIVE){
                    Log.d("kim","negative")
                }
            }
        }
        val notification: Uri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION)
        val ringtone = RingtoneManager.getRingtone(applicationContext, notification)
        ringtone.play()

        val vibrator = if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.S){
            val vibratorManager = this.getSystemService(Context.VIBRATOR_MANAGER_SERVICE) as VibratorManager
            vibratorManager.defaultVibrator
        }else{
            getSystemService(VIBRATOR_SERVICE) as Vibrator
        }
        AlertDialog.Builder(this).run{
            setTitle("test dialog")
            setIcon(R.drawable.ic_launcher_foreground)
            setMessage("종료?")
            setPositiveButton("OK",eventHandler)
            setNegativeButton("Cancel",eventHandler)
            setNeutralButton("More",null)
            show()
        }

    }

    @RequiresApi(Build.VERSION_CODES.R)
    fun showToast() {
        val toast = Toast.makeText(this, "종료하려면 한 번 더 누르세요.",Toast.LENGTH_SHORT)
        toast.addCallback(
            object : Toast.Callback(){
                override fun onToastHidden() {
                    super.onToastHidden()
                    Log.d("kim","toast hidden")
                }

                override fun onToastShown() {
                    super.onToastShown()
                    Log.d("kim","toast shown")
                }
            }
        )
        toast.show()
    }
    //뒤로가기 버튼 이벤트 핸들러
    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        //버튼 클릭시 처리
        if(keyCode === KeyEvent.KEYCODE_BACK){
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
                if(System.currentTimeMillis()-initTime>3000){
                    //토스트 알림
                    showToast()
                    initTime = System.currentTimeMillis()
                    return true
                }
            } else {
                Toast.makeText(this, "종료하려면 한 번 더 누르세요.", Toast.LENGTH_SHORT).show()
            }
        }
        return super.onKeyDown(keyCode, event)
    }
}