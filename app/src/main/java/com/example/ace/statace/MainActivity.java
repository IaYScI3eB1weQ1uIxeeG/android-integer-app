package com.example.ace.statace;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    int temperature  = 0;
    String temp_string = Integer.toString(temperature);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(temp_string);

        final Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                temperature ++;
                temp_string = Integer.toString(temperature);
                textView.setText(temp_string);
            }
        });

        final Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                temperature --;
                temp_string = Integer.toString(temperature);
                textView.setText(temp_string);
            }
        });
    }
}
