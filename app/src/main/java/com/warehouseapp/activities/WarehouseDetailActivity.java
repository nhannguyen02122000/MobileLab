package com.warehouseapp.activities;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.warehouseapp.R;

public class WarehouseDetailActivity extends AppCompatActivity {
    TextView tvLoc, tvAdd, tvPhone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.warehouse_detail);

        tvLoc = findViewById(R.id.tv_wh_name);
        tvLoc.setText(getIntent().getExtras().getString("loc"));
        tvAdd = findViewById(R.id.tv_address);
        tvAdd.setText(getIntent().getExtras().getString("add"));
        tvPhone = findViewById(R.id.tv_phone);
        tvPhone.setText(getIntent().getExtras().getString("phone"));
    }
}
