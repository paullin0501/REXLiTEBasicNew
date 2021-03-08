package com.rexlite.rexlitebasicnew;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.TimePicker;

public class Max2SettingActivity extends AppCompatActivity  {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_max2_setting);
        //選單設定
        ImageView leftIcon = findViewById(R.id.left_icon);
        TextView title = findViewById(R.id.toolbar_title);
        SeekBar seekBar = findViewById(R.id.seekBar);
        final Button ch1Button = (Button) findViewById(R.id.ch1_button);
        final Button ch2Button = (Button) findViewById(R.id.ch2_button);
        //TimePicker設定
        final TimePicker timePicker = findViewById(R.id.timepicker);
        final TextView timeText = findViewById(R.id.setting_timing);
        timePicker.setIs24HourView(true);

        ch1Button.setSelected(true);

        timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                timeText.setText(timePicker.getHour()+"hrs " + timePicker.getMinute()+"min");
            }
        });

        final TextView percentText = findViewById(R.id.percent);

        leftIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        title.setText("device name");


        //seekbar設定
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                percentText.setText(progress+"%");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        //ch按鍵邏輯設定
        ch1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ch1Button.setSelected(true);
                ch2Button.setSelected(false);
               // Log.d(TAG, "onClick: "+"123");
            }
        });

        ch2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ch1Button.setSelected(false);
                ch2Button.setSelected(true);
            }
        });



    }
  /*  public void ch1ButtonSelected(View view){
        ch1Button.setSelected(true);
        ch2Button.setSelected(false);
    }
    public void ch2ButtonSelected(View view){
        ch1Button.setSelected(false);
        ch2Button.setSelected(true);
    }*/


    }



