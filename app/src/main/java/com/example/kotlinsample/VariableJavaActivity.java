package com.example.kotlinsample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Locale;

public class VariableJavaActivity extends AppCompatActivity {

    int clickCount = 0;
    final long startTime = System.currentTimeMillis();
    TextView startTimeLabel;
    TextView clickCountLabel;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_variable);

        startTimeLabel = findViewById(R.id.startTimeLable);
        clickCountLabel = findViewById(R.id.clickCountLabel);

        button = findViewById(R.id.button);

        String timeText = new SimpleDateFormat("HH:mm:ss", Locale.KOREA).format(startTime);

        startTimeLabel.setText("Activity 시작시간: " + timeText);
        clickCountLabel.setText("버튼이 클린된 횟수: " + clickCount);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickCount += 1;
                clickCountLabel.setText("버튼이 클린된 횟수 : " + clickCount);
            }
        });
    }
}