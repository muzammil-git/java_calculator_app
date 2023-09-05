package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.twilio.Twilio;

public class MainActivity extends AppCompatActivity {

    EditText et1, et2;
    TextView tvAns;
    Button btnAdd, btnSub, btnMul, btnDiv;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = findViewById(R.id.et_1);
        et2 = findViewById(R.id.et_2);
        tvAns = findViewById(R.id.tv_1);
        btnAdd = findViewById(R.id.btn_add);
        btnSub = findViewById(R.id.btn_sub);
        btnMul = findViewById(R.id.btn_mul);
        btnDiv = findViewById(R.id.btn_div);


        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstValue, secondValue, answer;
                firstValue = Integer.parseInt(et1.getText().toString());
                secondValue = Integer.parseInt(et2.getText().toString());
                answer = firstValue + secondValue;

                tvAns.setText("Ans is = " + answer);
            }
        });


        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstValue, secondValue, answer;
                firstValue = Integer.parseInt(et1.getText().toString());
                secondValue = Integer.parseInt(et2.getText().toString());
                answer = firstValue - secondValue;

                tvAns.setText("Ans is = " + answer);
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstValue, secondValue, answer;
                firstValue = Integer.parseInt(et1.getText().toString());
                secondValue = Integer.parseInt(et2.getText().toString());
                answer = firstValue * secondValue;

                tvAns.setText("Ans is = " + answer);
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstValue, secondValue, answer;
                firstValue = Integer.parseInt(et1.getText().toString());
                secondValue = Integer.parseInt(et2.getText().toString());
                answer = firstValue / secondValue;

                tvAns.setText("Ans is = " + answer);
            }
        });




    }
}