package com.example.ying.project_hotline;


import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.InputStream;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    private static final  String TAG = "Myapp";
    private String json = null;
    private RequestQueue mRequestqueue;
    private ArrayList<String> hospitalName = new ArrayList<>();
    private ArrayList<String> hospitaltype = new ArrayList<>();
    private ArrayList<String> province = new ArrayList<>();
    private ArrayList<String> amphur = new ArrayList<>();
    private ArrayList<String> tambon = new ArrayList<>();
    private ArrayList<String> moonumber = new ArrayList<>();
    private ArrayList<String> status = new ArrayList<>();
    private ArrayList<String> address = new ArrayList<>();
    private ArrayList<String> postcode = new ArrayList<>();
    private ArrayList<String> tel = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: started.");
        initJSONRequest();
    }

    public void initJSONRequest(){
        Log.d(TAG, "initJSONRequest: prepare to request.");
        mRequestqueue = Volley.newRequestQueue(this);
        pasteJSON();
    }

    private void pasteJSON(){
        Log.d(TAG, "pasteJSON: Json pasting");
        final String url = "https://jsonblob.com/api/147ed234-ecc8-11e8-bcc5-ffc6d0c835ca";
        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url, null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        Log.d(TAG, "onResponse: JSON respond");
                        try {
                            JSONArray jsonArray = response.getJSONArray("data"); //root in JSON file

                            for(int i = 0; i < jsonArray.length(); i++){
                                JSONObject item = jsonArray.getJSONObject(i);
                                String hosname = item.getString("name");            //add Video url
                                Log.d(TAG, "onResponse: video ID :"+ (i+1)+" "+hosname);

                                JSONObject typecode = item.getJSONObject("typecode");    //find snippet Obj.
                                String hostype = typecode.getString("name");
                                Log.d(TAG, "onResponse: Video name :"+ (i+1)+" "+hostype);

                                JSONObject areacode = item.getJSONObject("areacode");
                                String provinceName = areacode.getString("province");
                                String amphurName = areacode.getString("amphur");
                                String tambonName = areacode.getString("tambon");
                                String moo = areacode.getString("moo");
                                Log.d(TAG, "onResponse: provinceName :"+ (i+1)+" "+provinceName);
                                Log.d(TAG, "onResponse: amphurName :"+ (i+1)+" "+amphurName);
                                Log.d(TAG, "onResponse: tambonName :"+ (i+1)+" "+tambonName);
                                Log.d(TAG, "onResponse: mooNo. :"+ (i+1)+" "+moo);

                                JSONObject hosstatus = item.getJSONObject("status");
                                String currenstatus = hosstatus.getString("name");
                                Log.d(TAG, "onResponse: CurrenStatus :"+ (i+1)+" "+currenstatus);

                                String hosaddress = item.getString("address");
                                String hospostcode = item.getString("postcode");
                                String hostelephone = item.getString("tel");
                                Log.d(TAG, "onResponse: hosaddress :"+ (i+1)+" "+hosaddress);
                                Log.d(TAG, "onResponse: hospostcode :"+ (i+1)+" "+hospostcode);
                                Log.d(TAG, "onResponse: hostelephone :"+ (i+1)+" "+hostelephone);

                                hospitalName.add(hosname);
                                hospitaltype.add(hostype);
                                province.add(provinceName);
                                amphur.add(amphurName);
                                tambon.add(tambonName);
                                moonumber.add(moo);
                                status.add(currenstatus);
                                address.add(hosaddress);
                                postcode.add(hospostcode);
                                tel.add(hostelephone);

                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d(TAG, "onErrorResponse: Error appear");
                error.printStackTrace();
            }
        });
        mRequestqueue.add(request);
    }

    public void openPage1(View v){
        startActivity(new Intent(this, Telephonenumber.class));
    }
    public void openPage2(View v){
        Intent itn2 = new Intent(this, Websitepage.class);
        startActivity(itn2);
    }

    private void intitReCycleview (){
        Log.d(TAG, "intitReCycleview: intitRecycleView");
        RecyclerView recyclerView = findViewById(R.id.yingRe);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this,hospitalName,hospitaltype,province,amphur,tambon,moonumber,status,address,postcode,tel);
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
