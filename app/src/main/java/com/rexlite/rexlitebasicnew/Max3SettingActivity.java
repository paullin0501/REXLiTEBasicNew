package com.rexlite.rexlitebasicnew;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Max3SettingActivity extends AppCompatActivity {

    FragmentTransaction fragmentTransaction;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_max3_setting);


        //選單設定
        ImageView leftIcon = findViewById(R.id.left_icon);
        TextView title = findViewById(R.id.toolbar_title);
        final Button ch1Button = (Button) findViewById(R.id.ch1_button);
        final Button ch2Button = (Button) findViewById(R.id.ch2_button);
        final Button ch3Button = (Button) findViewById(R.id.ch3_button);
        ch1Button.setSelected(true);
        leftIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        //控制畫面設定
        //fragmentTransaction = getSupportFragmentManager().beginTransaction();

        //裝置名稱
        title.setText("device name");
        //ch按鍵邏輯設定
        ch1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ch1Button.setSelected(true);
                ch2Button.setSelected(false);
                ch3Button.setSelected(false);
                CurtainFragment ch1Frag = new CurtainFragment();
                fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container,ch1Frag);
                fragmentTransaction.commit();

            }
        });

        ch2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ch1Button.setSelected(false);
                ch2Button.setSelected(true);
                ch3Button.setSelected(false);
                RelayFragment ch2Frag = new RelayFragment();
                fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container,ch2Frag);
                fragmentTransaction.commit();

            }
        });
        ch3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ch1Button.setSelected(false);
                ch2Button.setSelected(false);
                ch3Button.setSelected(true);
            }
        });


    }

}