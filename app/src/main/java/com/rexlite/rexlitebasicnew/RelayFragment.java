package com.rexlite.rexlitebasicnew;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;


public class RelayFragment extends Fragment {

    boolean liteStatus =false; //判斷目前燈是開或關的狀態
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_relay, container, false);
        SeekBar seekBar =view.findViewById(R.id.seekBar);
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
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_relay, container, false);
    }
   /* @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        View view = view.inflate(R.layout.fragment_relay, container, false);
        SeekBar seekBar =findViewById(R.id.seekBar);
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


    }*/
}