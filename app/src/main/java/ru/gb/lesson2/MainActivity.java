package ru.gb.lesson2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
//    int value = 0;
    int value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
//        value = Integer.parseInt(String.valueOf(editText.getText()));

        findViewById(R.id.button_0).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value += 0;
                textView.setText(String.valueOf(value));
            }
        });

        findViewById(R.id.button_1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value += 1;
                textView.setText(String.valueOf(value));
            }
        });
    }
}