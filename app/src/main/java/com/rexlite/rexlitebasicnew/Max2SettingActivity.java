package com.rexlite.rexlitebasicnew;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentTransaction;

import android.transition.TransitionManager;

import android.os.Bundle;
import android.transition.AutoTransition;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.TimePicker;

public class Max2SettingActivity extends AppCompatActivity {

    FragmentTransaction fragmentTransaction;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_max2_setting);
        //選單設定
        ImageView leftIcon = findViewById(R.id.left_icon);
        TextView title = findViewById(R.id.toolbar_title);
        // SeekBar seekBar = findViewById(R.id.seekBar);
        final Button ch1Button = (Button) findViewById(R.id.ch1_button);
        final Button ch2Button = (Button) findViewById(R.id.ch2_button);

        title.setText("device name");
        ch1Button.setSelected(true);


        //返回按鍵
        leftIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


        //ch按鍵邏輯設定
        ch1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ch1Button.setSelected(true);
                ch2Button.setSelected(false);
                ColorTemperatureFragment ch1Frag = new ColorTemperatureFragment();
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
                CurtainFragment ch2Frag = new CurtainFragment();
                fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container,ch2Frag);
                fragmentTransaction.commit();
            }
        });


    }
}


       /* //擴充功能
        final Button hiddenButton = findViewById(R.id.expand_button);
        final CardView cardView = findViewById(R.id.cardview);
        final ConstraintLayout hiddenView = findViewById(R.id.hidden_view);
        //TimePicker設定
        final TimePicker timePicker = findViewById(R.id.timepicker);
        final TextView timeText = findViewById(R.id.setting_timing);
        timePicker.setIs24HourView(true);*/



       /* timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                timeText.setText(timePicker.getHour()+"hrs   " + timePicker.getMinute()+"min");
            }
        });

        final TextView percentText = findViewById(R.id.percent);*/



       /* //seekbar設定
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
        });*/


    /*//卡片擴充按鍵
        hiddenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // If the CardView is already expanded, set its visibility
                //  to gone and change the expand less icon to expand more.
                if (hiddenView.getVisibility() == View.VISIBLE) {

                    // The transition of the hiddenView is carried out
                    //  by the TransitionManager class.
                    // Here we use an object of the AutoTransition
                    // Class to create a default transition.
                    TransitionManager.beginDelayedTransition(cardView,
                            new AutoTransition());
                    hiddenView.setVisibility(View.GONE);
                    hiddenButton.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_baseline_expand_more_24,0,0,0);
                }

                // If the CardView is not expanded, set its visibility
                // to visible and change the expand more icon to expand less.
                else {

                    TransitionManager.beginDelayedTransition(cardView,
                            new AutoTransition());
                    hiddenView.setVisibility(View.VISIBLE);
                    hiddenButton.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_baseline_expand_less_24,0,0,0);
                }
            }
        });

    }*/
  /*  public void ch1ButtonSelected(View view){
        ch1Button.setSelected(true);
        ch2Button.setSelected(false);
    }
    public void ch2ButtonSelected(View view){
        ch1Button.setSelected(false);
        ch2Button.setSelected(true);
    }*/






