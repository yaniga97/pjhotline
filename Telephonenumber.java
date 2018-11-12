package com.example.ying.project_hotline;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class Telephonenumber extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telephonenumber);
    }

        public void openPageMS(View v){
            startActivity(new Intent(this, Medicalservice.class));
        }
        public void openPagePU(View v){
            Intent itn2 = new Intent(this, PublicUtility.class);
            startActivity(itn2);
        }
    public void openPageGover(View v){
            startActivity(new Intent(this, Government.class));
        }
    public void openPageother(View v){
        startActivity(new Intent(this, Other.class));
    }
    public void openPageBank(View v){
        startActivity(new Intent(this, Bank.class));
    }
    public void openPageEM(View v){
        startActivity(new Intent(this, Emergency.class));
    }
}