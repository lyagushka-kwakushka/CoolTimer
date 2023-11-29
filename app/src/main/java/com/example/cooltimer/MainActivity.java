package com.example.cooltimer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.util.Log;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private SeekBar seekBar;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBar = findViewById(R.id.progressSeekBar);
        textView = findViewById(R.id.timerTextView);
        seekBar.setMax(600);
        seekBar.setProgress(60);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                int minutes = progress/60;
                int seconds = progress - (minutes * 60);

                String minutesString = "";
                String secondsString = "";

                if (minutes < 10){
                    minutesString = "0" + minutes;
                }
                else {
                    minutesString = String.valueOf(minutes);
                }

                if (seconds < 10){
                    secondsString = "0" + seconds;
                }
                else {
                    secondsString = String.valueOf(seconds);
                }

                textView.setText(minutesString + ":" + secondsString);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }
}