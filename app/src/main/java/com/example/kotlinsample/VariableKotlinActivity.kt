package com.example.kotlinsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.layout_variable.button
import kotlinx.android.synthetic.main.layout_variable.clickCountLabel
import kotlinx.android.synthetic.main.layout_variable.startTimeLable
import java.text.SimpleDateFormat
import java.util.Locale

class VariableKotlinActivity : AppCompatActivity() {

    var clickCount = 0
    val startTime = System.currentTimeMillis()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_variable)

        val timeText = SimpleDateFormat("HH:mm:ss", Locale.KOREA).format(startTime)
        startTimeLable.text = "Activity 시작시간: ${timeText}"
        clickCountLabel.text = "버튼이 클릭된 횟수: ${clickCount}"

        button.setOnClickListener {
            clickCount += 1;
            clickCountLabel.text = "버튼이 클릭된 횟수: ${clickCount}"
        }

    }
}