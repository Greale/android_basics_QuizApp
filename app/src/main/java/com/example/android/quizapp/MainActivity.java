package com.example.android.quizapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android.quizapp.R;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    int score = 0;

    // name_field
    // notARobot_checkBox
    //score_text_view
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void score(View v) {
        CheckBox robotCB = findViewById(R.id.notARobot_checkBox);
        if (robotCB.isChecked()) {
            TextView nameET = findViewById(R.id.name_field);
            String name = nameET.getText().toString();
            TextView scoreTW = findViewById(R.id.score_text_view);
            scoreTW.setText(score + "/4 " + "by " + name);
        }
    }
}
  //      CheckBox whippedCreamCheckBox = (CheckBox) findViewById(R.id.whipped_cream_checkbox);
    //    boolean hasWhippedCream = whippedCreamCheckBox.isChecked();