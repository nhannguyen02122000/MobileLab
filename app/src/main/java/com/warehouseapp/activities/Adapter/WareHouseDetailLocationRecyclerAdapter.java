package com.warehouseapp.activities.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.warehouseapp.R;
import com.warehouseapp.activities.DetailWarehouseLocationActivity;
import com.warehouseapp.activities.Model.WareHouse;
import com.warehouseapp.activities.WarehouseDetailActivity;

import java.util.ArrayList;

public class WareHouseDetailLocationRecyclerAdapter extends RecyclerView.Adapter<WareHouseDetailLocationRecyclerAdapter.MyViewHolder>  {
    private Context context;
    private ArrayList<WareHouse> wareHouses;

    public WareHouseDetailLocationRecyclerAdapter(Context ctx, ArrayList<WareHouse> wh){
        this.context=ctx;
        this.wareHouses=wh;
    }

    @Override
    public int getItemCount() {
        return wareHouses == null ? 0 : wareHouses.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView tvLoc,tvPhone,tvAdd;
        private RelativeLayout rl;

        public MyViewHolder(View itemView) {
            super(itemView);

            rl = itemView.findViewById(R.id.cv_cate_1);
            tvLoc = itemView.findViewById(R.id.tv_location);
            tvAdd = itemView.findViewById(R.id.tv_add);
            tvPhone = itemView.findViewById(R.id.tv_phone);
        }
    }

    @Override
    public WareHouseDetailLocationRecyclerAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.listview_warehouse_detail,parent,false);
        MyViewHolder vh = new MyViewHolder(itemView);
        return vh;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        String location = wareHouses.get(position).getLocation();
        String phone = wareHouses.get(position).getPhoneNo();
        String add = wareHouses.get(position).getAddress();

        holder.tvLoc.setText(location);
        holder.tvPhone.setText(phone);
        holder.tvAdd.setText(add);

        holder.rl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, WarehouseDetailActivity.class);
                intent.putExtra("loc", location);
                intent.putExtra("add", add);
                intent.putExtra("phone", phone);
                context.startActivity(intent);
            }
        });
    }
}
