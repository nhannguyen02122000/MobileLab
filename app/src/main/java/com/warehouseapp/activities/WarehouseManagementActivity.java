package com.warehouseapp.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.warehouseapp.R;
import com.warehouseapp.activities.Adapter.WareHouseLocationRecyclerAdapter;
import com.warehouseapp.activities.Model.WareHouse;

import java.util.ArrayList;

public class WarehouseManagementActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ImageView btn;
    ArrayList<WareHouse> whs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.warehouse_location_list);

        recyclerView = findViewById(R.id.loc_list_rec);
        whs = new ArrayList<WareHouse>();
        for (int i = 1; i <= 5; i++) {
            whs.add(new WareHouse("Hồ Chí Minh"+i , "",""));
        }
        for (int i = 1; i <= 5; i++) {
            whs.add(new WareHouse("Bình Dương"+i , "",""));
        }
        for (int i = 1; i <= 5; i++) {
            whs.add(new WareHouse("Bình Phước"+i , "",""));
        }
        for (int i = 1; i <= 5; i++) {
            whs.add(new WareHouse("Đồng Nai"+i , "",""));
        }
        for (int i = 1; i <= 5; i++) {
            whs.add(new WareHouse("Hà Nội"+i , "",""));
        }

        WareHouseLocationRecyclerAdapter adapter = new WareHouseLocationRecyclerAdapter(this, whs);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(linearLayoutManager);

        btn=findViewById(R.id.imageView3_abc);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
