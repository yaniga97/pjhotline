package com.example.ying.project_hotline;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class Emergency extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency);

    }
    @SuppressLint("MissingPermission")
    public void call(View v){
        Intent tn1 = new Intent(Intent.ACTION_CALL);
        tn1.setData(Uri.parse("tel:1195"));
        startActivity(tn1);
    }
    @SuppressLint("MissingPermission")
    public void call2(View v){
        Intent tn2 = new Intent(Intent.ACTION_CALL);
        tn2.setData(Uri.parse("tel:1155"));
        startActivity(tn2);
    }
    @SuppressLint("MissingPermission")
    public void call3(View v){
        Intent tn3 = new Intent(Intent.ACTION_CALL);
        tn3.setData(Uri.parse("tel:1192"));
        startActivity(tn3);
    }
    @SuppressLint("MissingPermission")
    public void call4(View v){
        Intent tn4 = new Intent(Intent.ACTION_CALL);
        tn4.setData(Uri.parse("tel:1146"));
        startActivity(tn4);
    }
    @SuppressLint("MissingPermission")
    public void call5(View v){
        Intent tn5 = new Intent(Intent.ACTION_CALL);
        tn5.setData(Uri.parse("tel:191"));
        startActivity(tn5);
    }
    @SuppressLint("MissingPermission")
    public void call6(View v){
        Intent tn6 = new Intent(Intent.ACTION_CALL);
        tn6.setData(Uri.parse("tel:199"));
        startActivity(tn6);
    }
    @SuppressLint("MissingPermission")
    public void call7(View v){
        Intent tn7 = new Intent(Intent.ACTION_CALL);
        tn7.setData(Uri.parse("tel:1196"));
        startActivity(tn7);
    }
    @SuppressLint("MissingPermission")
    public void call8(View v){
        Intent tn8 = new Intent(Intent.ACTION_CALL);
        tn8.setData(Uri.parse("tel:022412051"));
        startActivity(tn8);
    }

}
