package com.rexlite.rexlitebasicnew;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class SceneSettingActivity extends AppCompatActivity implements View.OnClickListener{

    private Button[] btn = new Button[6];
    private Button btn_unfocus;
    private int[] btn_id = {R.id.scene1_btn,R.id.scene2_btn,R.id.scene3_btn,R.id.scene4_btn,R.id.scene5_btn,R.id.scene6_btn};
    private int[] btn_offimage = {R.drawable.scene1,R.drawable.scene2,R.drawable.scene3,R.drawable.scene4,R.drawable.scene5,R.drawable.scene6};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scene_setting);

        //選單設定
        ImageView leftIcon = findViewById(R.id.left_icon);
        ImageView detailIcon = findViewById(R.id.detail_icon);
        TextView title = findViewById(R.id.toolbar_title);

        leftIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        detailIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        title.setText("device name");

        //單選按鈕邏輯設定
        for(int i = 0; i < btn.length; i++){
            btn[i] = (Button) findViewById(btn_id[i]);
            btn[i].setBackgroundResource(btn_offimage[i]);
            btn[i].setOnClickListener(this);
        }

        btn_unfocus = btn[0];
    }
    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.scene1_btn :
                btn[0].setBackgroundResource(R.drawable.scene1_on);
                btn[1].setBackgroundResource(R.drawable.scene2);
                btn[2].setBackgroundResource(R.drawable.scene3);
                btn[3].setBackgroundResource(R.drawable.scene4);
                btn[4].setBackgroundResource(R.drawable.scene5);
                btn[5].setBackgroundResource(R.drawable.scene6);
                break;

            case R.id.scene2_btn :
                btn[0].setBackgroundResource(R.drawable.scene1);
                btn[1].setBackgroundResource(R.drawable.scene2_on);
                btn[2].setBackgroundResource(R.drawable.scene3);
                btn[3].setBackgroundResource(R.drawable.scene4);
                btn[4].setBackgroundResource(R.drawable.scene5);
                btn[5].setBackgroundResource(R.drawable.scene6);
                break;

            case R.id.scene3_btn :
                btn[0].setBackgroundResource(R.drawable.scene1);
                btn[1].setBackgroundResource(R.drawable.scene2);
                btn[2].setBackgroundResource(R.drawable.scene3_on);
                btn[3].setBackgroundResource(R.drawable.scene4);
                btn[4].setBackgroundResource(R.drawable.scene5);
                btn[5].setBackgroundResource(R.drawable.scene6);
                break;

            case R.id.scene4_btn :
                btn[0].setBackgroundResource(R.drawable.scene1);
                btn[1].setBackgroundResource(R.drawable.scene2);
                btn[2].setBackgroundResource(R.drawable.scene3);
                btn[3].setBackgroundResource(R.drawable.scene4_on);
                btn[4].setBackgroundResource(R.drawable.scene5);
                btn[5].setBackgroundResource(R.drawable.scene6);
                break;
            case R.id.scene5_btn :
                btn[0].setBackgroundResource(R.drawable.scene1);
                btn[1].setBackgroundResource(R.drawable.scene2);
                btn[2].setBackgroundResource(R.drawable.scene3);
                btn[3].setBackgroundResource(R.drawable.scene4);
                btn[4].setBackgroundResource(R.drawable.scene5_on);
                btn[5].setBackgroundResource(R.drawable.scene6);
                break;
            case R.id.scene6_btn :
                btn[0].setBackgroundResource(R.drawable.scene1);
                btn[1].setBackgroundResource(R.drawable.scene2);
                btn[2].setBackgroundResource(R.drawable.scene3);
                btn[3].setBackgroundResource(R.drawable.scene4);
                btn[4].setBackgroundResource(R.drawable.scene5);
                btn[5].setBackgroundResource(R.drawable.scene6_on);
                break;
        }
    }

   /* private void setFocus(Button btn_unfocus, Button btn_focus){
        btn_unfocus.setTextColor(Color.rgb(49, 50, 51));
        btn_unfocus.setBackgroundColor(Color.rgb(207, 207, 207));
        btn_focus.setTextColor(Color.rgb(255, 255, 255));
        btn_focus.setBackgroundColor(Color.rgb(3, 106, 150));
        this.btn_unfocus = btn_focus;
    }*/



    }
