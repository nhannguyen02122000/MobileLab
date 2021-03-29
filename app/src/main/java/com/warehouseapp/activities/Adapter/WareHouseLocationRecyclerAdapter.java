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

import java.util.ArrayList;

public class WareHouseLocationRecyclerAdapter extends RecyclerView.Adapter<WareHouseLocationRecyclerAdapter.MyViewHolder>  {
    private Context context;
    private ArrayList<WareHouse> wareHouses;

    public WareHouseLocationRecyclerAdapter(Context ctx, ArrayList<WareHouse> wh){
        this.context=ctx;
        this.wareHouses=wh;
    }

    @Override
    public int getItemCount() {
        return wareHouses == null ? 0 : wareHouses.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView tvLoc;
        private RelativeLayout rl;

        public MyViewHolder(View itemView) {
            super(itemView);

            rl = itemView.findViewById(R.id.cv_cate_1);
            tvLoc = itemView.findViewById(R.id.tv_list_loc);

//            itemView.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    Intent intent = new Intent(, SignoutActivity.class);
//                    intent.putExtra("EXTRA_SESSION_ID", sessionId);
//                    startActivity(intent);
//                }
//            });
        }
    }

    @Override
    public WareHouseLocationRecyclerAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.listview_warehouse_location,parent,false);
        MyViewHolder vh = new MyViewHolder(itemView);
        return vh;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        String location = wareHouses.get(position).getLocation();

        holder.tvLoc.setText(location);
        holder.rl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailWarehouseLocationActivity.class);
                intent.putExtra("name", location);
                context.startActivity(intent);
            }
        });
    }
}
