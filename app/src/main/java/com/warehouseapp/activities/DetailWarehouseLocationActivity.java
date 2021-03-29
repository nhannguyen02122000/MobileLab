package com.warehouseapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.warehouseapp.R;
import com.warehouseapp.activities.Adapter.WareHouseDetailLocationRecyclerAdapter;
import com.warehouseapp.activities.Adapter.WareHouseLocationRecyclerAdapter;
import com.warehouseapp.activities.Model.WareHouse;

import java.util.ArrayList;

public class DetailWarehouseLocationActivity extends AppCompatActivity {
    ImageView btn;
    TextView tvTitle;
    RecyclerView recyclerView;
    ArrayList<WareHouse> whs;
    RelativeLayout btnThemKho;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_warehouse_location_list);

        btn = findViewById(R.id.imageView3_xyz);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        tvTitle = findViewById(R.id.textView6_tenkho);
        tvTitle.setText(getIntent().getStringExtra("name"));

        recyclerView = findViewById(R.id.rv_123);
        whs = new ArrayList<WareHouse>();
        for (int i = 1; i <= 5; i++) {
            whs.add(new WareHouse("Hồ Chí Minh "+i , "234 ABC","0913018824"));
        }
        for (int i = 1; i <= 5; i++) {
            whs.add(new WareHouse("Bình Dương "+i , "232 DEF","09131282838"));
        }
        for (int i = 1; i <= 5; i++) {
            whs.add(new WareHouse("Bình Phước "+i , "442 sfs","0924024824"));
        }
        for (int i = 1; i <= 5; i++) {
            whs.add(new WareHouse("Đồng Nai "+i , "242 fff","09357859393"));
        }
        for (int i = 1; i <= 5; i++) {
            whs.add(new WareHouse("Hà Nội "+i , "1233 ffs","09247292773"));
        }

        WareHouseDetailLocationRecyclerAdapter adapter = new WareHouseDetailLocationRecyclerAdapter(this, whs);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(linearLayoutManager);


        btnThemKho = findViewById(R.id.rl_them);
        btnThemKho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DetailWarehouseLocationActivity.this,AddNewWareHouseActivity.class));
            }
        });
    }
}
