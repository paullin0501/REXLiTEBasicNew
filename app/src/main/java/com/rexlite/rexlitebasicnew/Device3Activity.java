package com.rexlite.rexlitebasicnew;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioGroup;

public class Device3Activity extends AppCompatActivity {
    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_device3);
        viewPager = (ViewPager)findViewById(R.id.viewpager);
        viewPager.setAdapter(new ViewPagerAdapter(getSupportFragmentManager()));




    }
    /*public void onClick(View view) {
        transaction = manager.beginTransaction();
        switch (view.getId()) {
            case R.id.max1:
                Max1Fragment fragment1 = new Max1Fragment();
                Log.d("test", "onClick: "+1);
                transaction.replace(R.id.center, fragment1, "fragment1");
                break;
            case R.id.max2:
                Max2Fragment fragment2 = new Max2Fragment();
                Log.d("test", "onClick: "+2);
                transaction.replace(R.id.center, fragment2, "fragment2");
                break;
            case R.id.max3:
                Max2Fragment fragment3 = new Max2Fragment();
                transaction.replace(R.id.center, fragment3, "fragment3");
                break;

        }

        transaction.commit();
    }*/
    public void setViewPager(int fragmentNumber){
        viewPager.setCurrentItem(fragmentNumber);
    }
}
