package com.example.kotlinsample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.layout_view_binding.bmiButton
import kotlinx.android.synthetic.main.layout_view_binding.resultLabel
import kotlinx.android.synthetic.main.layout_view_binding.tallField
import kotlinx.android.synthetic.main.layout_view_binding.weightField

//import kotlinx.android.synthetic.main.activity_main.button1

class BmiKotlinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_view_binding);

        // bmi버튼이 클릭된 경우 동작하는 코드를 작성한다.
        bmiButton.setOnClickListener {
            // tallField 에서 값을 읽어옴.
            val tall = tallField.text.toString().toDouble();

            // weightField 에서 값을 읽어옴.
            val weight = weightField.text.toString().toDouble();

            val bmi = weight / Math.pow(tall / 100, 2.0)

            resultLabel.text = "키: ${tallField.text}, 체중: ${weightField.text}, BMI: $bmi"
        }
    }
}