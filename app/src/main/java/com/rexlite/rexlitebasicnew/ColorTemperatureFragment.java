package com.rexlite.rexlitebasicnew;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.TimePicker;


public class ColorTemperatureFragment extends Fragment {



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_color_temperature, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        SeekBar seekBar = view.findViewById(R.id.seekBar);
        SeekBar temperatureSeekBar = view.findViewById(R.id.temperature_seekBar);
        //擴充功能
        final Button hiddenButton = view.findViewById(R.id.expand_button);
        final CardView cardView = view.findViewById(R.id.cardview);
        final ConstraintLayout hiddenView = view.findViewById(R.id.hidden_view);
        //TimePicker設定
        final TimePicker timePicker = view.findViewById(R.id.timepicker);
        final TextView timeText = view.findViewById(R.id.setting_timing);
        timePicker.setIs24HourView(true);



        timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                timeText.setText(timePicker.getHour()+"hrs   " + timePicker.getMinute()+"min");
            }
        });




        final TextView percentText = view.findViewById(R.id.percent);
        final TextView temperatureText =  view.findViewById(R.id.temperature);
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
        //色溫seekbar設定
        temperatureSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                temperatureText.setText(progress + "K");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


        //卡片擴充按鍵
        hiddenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
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
    }
}