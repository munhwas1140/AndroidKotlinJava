package com.example.kotlinsample;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BmiJavaActivity extends AppCompatActivity {

    EditText tallField, weightField;
    TextView resultLabel;
    Button bmiButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // UI로 사용할 레이아웃 XML 파일을 지정한다.
        setContentView(R.layout.layout_view_binding);

        tallField = findViewById(R.id.tallField);
        weightField = findViewById(R.id.weightField);
        resultLabel = findViewById(R.id.resultLabel);
        bmiButton = findViewById(R.id.bmiButton);


        bmiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // tall의 값을 읽어온다
                String tall = tallField.getText().toString();

                // weightField의 값을 읽어온다.
                String weight = weightField.getText().toString();

                // BMI계산. 체중(kg) / 키(m) * 키(m) >> 키를 cm로 입력받았으므로 100으로 나누어 제곱
                // Math.pow() 이용
                double bmi = Double.parseDouble(weight) / Math.pow(Double.parseDouble(tall) / 100.0, 2);

                // 결과 bmi를 resultLabel에 보여준다.
                resultLabel.setText("키: " + tall + ", 체중: " + weight +", BMI: " + bmi);
            }
        });
    }
}