package com.rexlite.rexlitebasicnew;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

import java.lang.reflect.Method;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private static final int REQUEST_LOGIN = 100;
    private static final String TAG = MainActivity.class.getSimpleName();
    public static boolean logon = false;
    private DrawerLayout drawer;


   /* @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
       // item.getItemId()
        switch (item.getItemId()) {
            case android.R.id.home:
              drawer.openDrawer(GravityCompat.START);
                return true;

        }
        return super.onOptionsItemSelected(item);
    }*/

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {




        //一般menu可能無法顯示icon時使用的
       // getMenuInflater().inflate(R.menu.menu_main,menu);
       /* try {  //顯示menu的Icons
            Class<?> clazz = Class . forName ("androidx.appcompat.view.menu.MenuBuilder");
            Method m = clazz . getDeclaredMethod ("setOptionalIconsVisible", boolean.class);
            m.setAccessible(true);
            m.invoke(menu, true);
        } catch (Exception e) {
            e.printStackTrace();
        }*/
      /*  int positionOfMenuItem = 0;
        MenuItem item = menu.getItem(positionOfMenuItem);
        SpannableString s = new SpannableString("My red MenuItem");
        s.setSpan(new ForegroundColorSpan(Color.RED), 0, s.length(), 6);
        item.setTitle(s);*/

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        DrawerLayout drawerLayout = findViewById(R.id.drawer_layout);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false); //關閉toolbar的標題文字
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawer,toolbar,
                R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.setDrawerIndicatorEnabled(true);
        toggle.syncState();
      /*  Button fab = findViewById(R.id.add_device);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,AddActivity.class);
                startActivity(intent);
            }
        });*/
        //判斷登入
        if(!logon){
            Intent intent = new Intent(this,LoginActivity.class);
            startActivityForResult(intent,REQUEST_LOGIN);
        }
    }

   /* @Override
    public void onBackPressed() {
       // super.onBackPressed();
        if(drawer.isDrawerOpen(GravityCompat.START)){
            drawer.closeDrawer(GravityCompat.START);
        } else  {
            super.onBackPressed();
        }
    }*/

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == REQUEST_LOGIN){
            if(resultCode != RESULT_OK){
                finish();
            }
        }
    }
    //功能選單實作
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_user_profile:
                Toast.makeText(this,"user_profile",Toast.LENGTH_SHORT).show();
                Log.d(TAG, "onNavigationItemSelected: ");
                break;
            case R.id.action_device_search:
                Toast.makeText(this,"device_search",Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_device_rescan:
                Toast.makeText(this,"device_rescan",Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_list_device_id:
                Toast.makeText(this,"list_device_id",Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_reset_maxscene:
                Toast.makeText(this,"reset_maxscene",Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_setting:
                Toast.makeText(this,"setting",Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_help:
                Toast.makeText(this,"help",Toast.LENGTH_SHORT).show();
                break;
        }
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    public void add(){

    }


}
