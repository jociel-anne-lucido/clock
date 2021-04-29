package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
ConstraintLayout layout;
TextView calculatedTime;
TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.greetings);
        calculatedTime=findViewById(R.id.time1);

        Calendar calendar = Calendar.getInstance();
        String currentDate= DateFormat.getDateInstance(DateFormat.FULL).format(calendar.getTime());

        calendar.add(Calendar.MINUTE, 15);
        String result = DateFormat.getDateInstance(DateFormat.FULL).format(calendar.getTime());
        calculatedTime.setText(result);


        TextView textViewDate = findViewById(R.id.date);
        textViewDate.setText(currentDate);

        int Hours=calendar.get(Calendar.HOUR_OF_DAY);

        if (Hours > 0 && Hours < 12) {
            textView.setText("Good Morning!");
        }
        else if(Hours>=12 && Hours<17) {
            textView.setText("Good Afternoon!");

        }
        else {
            textView.setText("Good Night!");
        }
    }
}