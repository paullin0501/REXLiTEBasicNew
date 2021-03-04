package com.rexlite.rexlitebasicnew;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

public class Max1SettingActivity extends AppCompatActivity {

    private String TAG= "123";
    boolean liteStatus =false; //判斷目前燈是開或關的狀態
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_max1_setting);

        //選單設定
        ImageView leftIcon = findViewById(R.id.left_icon);
        TextView title = findViewById(R.id.toolbar_title);
        SeekBar seekBar = findViewById(R.id.seekBar);
        leftIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        //seekbar設定
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                int progress = seekBar.getProgress();

                if(!liteStatus & progress > 0) {
                    seekBar.setProgress(100);
                    liteStatus = true;
                }
               else if(liteStatus & progress < 100) {
                    seekBar.setProgress(0);
                    liteStatus = false;
                }
            }
        });
    }
}