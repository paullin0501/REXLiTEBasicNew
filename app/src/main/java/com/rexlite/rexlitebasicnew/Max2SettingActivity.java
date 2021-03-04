package com.rexlite.rexlitebasicnew;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

public class Max2SettingActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView[] btn = new ImageView[2];
    private int[] btn_id = {R.id.ch1,R.id.ch2};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_max2_setting);
        //選單設定
        ImageView leftIcon = findViewById(R.id.left_icon);
        TextView title = findViewById(R.id.toolbar_title);
        SeekBar seekBar = findViewById(R.id.seekBar);
        final TextView percentText = findViewById(R.id.percent);

        leftIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        title.setText("device name");
        btn[0] = (ImageView) findViewById(btn_id[0]);
        btn[1] = (ImageView) findViewById(btn_id[1]);
        btn[0].setImageResource(R.drawable.ch1_off);

        btn[1].setImageResource(R.drawable.ch2_on);
        btn[0].setOnClickListener(this);
        btn[1].setOnClickListener(this);

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


    }
    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.ch1:
                btn[0].setImageResource(R.drawable.ch1_on);
                btn[1].setImageResource(R.drawable.ch2_off);
                break;
            case R.id.ch2:
                btn[0].setImageResource(R.drawable.ch1_off);
                btn[1].setImageResource(R.drawable.ch2_on);
                break;

        }
    }



}