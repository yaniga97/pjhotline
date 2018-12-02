package com.example.ying.project_hotline;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Websitepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_websitepage);
    }
    public void openJS100(View v){
        Uri uri = Uri.parse("http://www.js100.com/en/site/home/index");
        Intent itn1 = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(itn1);
    }
    public void openH(View v){
        Uri uri1 = Uri.parse("http://www.rvp-eclaim.com/index.html");
        Intent itn2 = new Intent(Intent.ACTION_VIEW,uri1);
        startActivity(itn2);
    }
    public void openPL(View v){
        Uri uri2 = Uri.parse("https://www.royalthaipolice.go.th/index.php");
        Intent itn3 = new Intent(Intent.ACTION_VIEW,uri2);
        startActivity(itn3);
    }
    public void openPEA(View v){
        Uri uri3 = Uri.parse("https://www.pea.co.th/%E0%B8%95%E0%B8%B4%E0%B8%94%E0%B8%95%E0%B9%88%E0%B8%AD%E0%B9%80%E0%B8%A3%E0%B8%B2");
        Intent itn4 = new Intent(Intent.ACTION_VIEW,uri3);
        startActivity(itn4);
    }
    public void openMEA(View v){
        Uri uri5 = Uri.parse("http://www.mea.or.th/minisite/callcenter");
        Intent itn5 = new Intent(Intent.ACTION_VIEW,uri5);
        startActivity(itn5);
    }

}
