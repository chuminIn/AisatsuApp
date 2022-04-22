package jp.techacademy.bunta.tsurumi.aisatsuapp

import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener {
            showTimePickerDialog()
        }
    }

    private fun showTimePickerDialog() {
        val timePickerDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener { view, hour, minute ->
                Log.d("UI_PARTS", "$hour:$minute")
                if ((hour >= 2 && minute >= 0) && (hour <= 9 && minute <= 59)){
                    textView.text = "おはよう"
                    Log.d("UI","msg")
                }else if ((hour >= 10 && minute >= 0 ) && (hour <= 17 && minute <= 59)){
                    textView.text = "こんにちは"
                }else if (hour >= 18 && minute >= 0) {
                    textView.text = "こんばんわ"
                }else{
                    textView.text = "こんばんわ"
                }
            },
            13, 0, true)
         timePickerDialog.show()
    }
}