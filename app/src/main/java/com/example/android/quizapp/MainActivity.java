package com.example.android.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int answerScore = 0;

    public int b1() {
        RadioButton b12 = (RadioButton) findViewById(R.id.btn1_2);
        if (b12.isChecked()) return 1;
        else return 0;
    }

    public int b2() {
        RadioButton b21 = (RadioButton) findViewById(R.id.btn2_1);
        if (b21.isChecked()) return 1;
        else return 0;
    }

    public int b3() {
        CheckBox b31 = (CheckBox) findViewById(R.id.btn3_1);
        CheckBox b33 = (CheckBox) findViewById(R.id.btn3_3);
        if (b31.isChecked() && b33.isChecked()) return 1;
        else return 0;
    }

    public int b4() {
        RadioButton b43 = (RadioButton) findViewById(R.id.btn4_3);
        if (b43.isChecked()) return 1;
        else return 0;
    }

    public int b5() {
        RadioButton b52 = (RadioButton) findViewById(R.id.btn5_2);
        if (b52.isChecked()) return 1;
        else return 0;
    }

    public int b6() {
        RadioButton b61 = (RadioButton) findViewById(R.id.btn6_1);
        if (b61.isChecked()) return 1;
        else return 0;
    }

    public int b7() {
        RadioButton b72 = (RadioButton) findViewById(R.id.btn7_2);
        if (b72.isChecked()) return 1;
        else return 0;
    }

    public int b8() {
        RadioButton b82 = (RadioButton) findViewById(R.id.btn8_2);
        if (b82.isChecked()) return 1;
        else return 0;
    }

    public void result(View view) {
        answerScore = b1() + b2() + b3() + b4() + b5() + b6() + b7() + b8();
        Toast.makeText(this, "Your score is " + answerScore + "/8 \nCongratulations", Toast.LENGTH_LONG).show();
    }

}
