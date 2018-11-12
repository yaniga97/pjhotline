package com.example.ying.project_hotline;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openPage1(View v){
        startActivity(new Intent(this, Telephonenumber.class));
    }
    public void openPage2(View v){
        Intent itn2 = new Intent(this, Websitepage.class);
        startActivity(itn2);
    }
}
