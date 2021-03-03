package com.rexlite.rexlitebasicnew;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Max3SettingActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView[] btn = new ImageView[3];
    private int[] btn_id = {R.id.ch1,R.id.ch2,R.id.ch3};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_max3_setting);
        //選單設定
        ImageView leftIcon = findViewById(R.id.left_icon);
        TextView title = findViewById(R.id.toolbar_title);

        leftIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        title.setText("device name");
        btn[0] = (ImageView) findViewById(btn_id[0]);
        btn[1] = (ImageView) findViewById(btn_id[1]);
        btn[2] = (ImageView) findViewById(btn_id[2]);
        btn[0].setImageResource(R.drawable.ch1_on);
        btn[1].setImageResource(R.drawable.ch2_off);
        btn[2].setImageResource(R.drawable.ch3_off);
        btn[0].setOnClickListener(this);
        btn[1].setOnClickListener(this);
        btn[2].setOnClickListener(this);


    }
    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.ch1:
                btn[0].setImageResource(R.drawable.ch1_on);
                btn[1].setImageResource(R.drawable.ch2_off);
                btn[2].setImageResource(R.drawable.ch3_off);
                break;
            case R.id.ch2:
                btn[0].setImageResource(R.drawable.ch1_off);
                btn[1].setImageResource(R.drawable.ch2_on);
                btn[2].setImageResource(R.drawable.ch3_off);
                break;
            case R.id.ch3:
                btn[0].setImageResource(R.drawable.ch1_off);
                btn[1].setImageResource(R.drawable.ch2_off);
                btn[2].setImageResource(R.drawable.ch3_on);
                break;

        }
    }
}