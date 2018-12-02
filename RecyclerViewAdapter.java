package com.example.ying.project_hotline;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{
    private static final String TAG = "RecyclerViewAdapter";

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
    private Context mContext;

    //POJO
    public RecyclerViewAdapter( Context mContext, ArrayList<String> hospitalName, ArrayList<String> hospitaltype,
                                ArrayList<String> province, ArrayList<String> amphur, ArrayList<String> tambon,ArrayList<String> moonumber
            ,ArrayList<String> status, ArrayList<String> address, ArrayList<String> postcode ,ArrayList<String> tel){
        this.hospitalName = hospitalName;
        this.hospitaltype = hospitaltype;
        this.province = province;
        this.amphur = amphur;
        this.tambon = tambon;
        this.moonumber = moonumber;
        this.status = status;
        this.address = address;
        this.postcode = postcode;
        this.tel = tel;
        this.mContext = mContext;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int i){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_listitem,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {

        return 0;

    }


    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView mhospitalName;
        TextView mhospitaltype;
        TextView mprovince;
        TextView mamphur;
        TextView mtambon;
        TextView mmoonumber;
        TextView mstatus;
        TextView maddress;
        TextView mpostcode;
        TextView mtel;

        public ViewHolder(View itemView){
            super(itemView);
            mhospitalName = itemView.findViewById(R.id.hospitalName);
            mhospitaltype = itemView.findViewById(R.id.hospitaltype);
            mprovince = itemView.findViewById(R.id.province);
            mamphur = itemView.findViewById(R.id.amphur);
            mtambon = itemView.findViewById(R.id.tambon);
            mmoonumber = itemView.findViewById(R.id.moonumber);
            mstatus = itemView.findViewById(R.id.status);
            maddress = itemView.findViewById(R.id.address);
            mpostcode = itemView.findViewById(R.id.postcode);
            mtel = itemView.findViewById(R.id.tel);

        }
    }
}
