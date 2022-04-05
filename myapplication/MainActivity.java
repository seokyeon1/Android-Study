package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /*
    1. 전역변수
    2. intent를 통해서
     */
    int count = 0;
    public static int hi = 1;
    Button buttonUp;
    Button buttonDown;
    Button buttonSquared;
    TextView textView;
    Button buttonPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonUp = findViewById(R.id.button);
        buttonDown = findViewById(R.id.button2);
        textView = findViewById(R.id.textView);
        buttonSquared = findViewById(R.id.button3);
        buttonPage = findViewById(R.id.button5);

        buttonUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count += hi;
                if (count == 30) {
                    count = 0;
                    Toast.makeText(getApplicationContext(), "SUCCESS", Toast.LENGTH_SHORT).show();
                }
                textView.setText(String.valueOf(count));
            };
        });

        buttonDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count -= hi;
                textView.setText(String.valueOf(count));
            }
        });

        buttonSquared.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hi++;
            }
        });

        buttonPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });
    }
}
