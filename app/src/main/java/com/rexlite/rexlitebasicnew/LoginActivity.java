package com.rexlite.rexlitebasicnew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    private EditText edSsid;
    private EditText edPasswd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        /*getSupportActionBar().hide();
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN);*/ //將標題隱藏
        edSsid = findViewById(R.id.ssid);
        edPasswd = findViewById(R.id.passwd);
    }
    public  void login(View view){
        String ssid = edSsid.getText().toString();
        String passwd = edPasswd.getText().toString();
       // setResult(RESULT_OK);
        Intent intent = new Intent(this,SlashActivity.class);
        startActivity(intent);

    }
}
