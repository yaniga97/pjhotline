package com.example.ying.project_hotline;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class PublicUtility extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_public_utility);

    }

    @SuppressLint("MissingPermission")
    public void call2(View v){
        Intent tn2 = new Intent(Intent.ACTION_CALL);
        tn2.setData(Uri.parse("tel:1162"));
        startActivity(tn2);
    }
    @SuppressLint("MissingPermission")
    public void call3(View v){
        Intent tn3 = new Intent(Intent.ACTION_CALL);
        tn3.setData(Uri.parse("tel:1460"));
        startActivity(tn3);
    }
    @SuppressLint("MissingPermission")
    public void call4(View v){
        Intent tn4 = new Intent(Intent.ACTION_CALL);
        tn4.setData(Uri.parse("tel:1129"));
        startActivity(tn4);
    }
    @SuppressLint("MissingPermission")
    public void call5(View v){
        Intent tn5 = new Intent(Intent.ACTION_CALL);
        tn5.setData(Uri.parse("tel:1130"));
        startActivity(tn5);
    }
    @SuppressLint("MissingPermission")
    public void call6(View v){
        Intent tn6 = new Intent(Intent.ACTION_CALL);
        tn6.setData(Uri.parse("tel:1125"));
        startActivity(tn6);
    }


}
