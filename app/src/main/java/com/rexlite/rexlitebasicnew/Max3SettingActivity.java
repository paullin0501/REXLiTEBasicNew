package com.rexlite.rexlitebasicnew;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Max3SettingActivity extends AppCompatActivity {


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



    }

}