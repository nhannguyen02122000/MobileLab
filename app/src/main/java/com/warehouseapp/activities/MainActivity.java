package com.warehouseapp.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.warehouseapp.R;


public class MainActivity extends AppCompatActivity {

    CardView nhap,xuat,file,pro,move,quanly;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nhap = findViewById(R.id.cvout1);
        xuat = findViewById(R.id.cvout2);
        file = findViewById(R.id.cvout3);
        move = findViewById(R.id.cvout11);
        pro = findViewById(R.id.cvout21);
        quanly = findViewById(R.id.cvout31);

        nhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,ImportProductActivity.class));
            }
        });
        xuat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,ExportActivity.class));
            }
        });
        file.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,CreateFileActivity.class));
            }
        });
        move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,MoveProductActivity.class));
            }
        });
        pro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,ProductListActivity.class));
            }
        });
        quanly.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(MainActivity.this,WarehouseManagementActivity.class));
                    }});
    }
}