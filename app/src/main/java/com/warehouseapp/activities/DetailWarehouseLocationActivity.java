package com.warehouseapp.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.warehouseapp.R;

public class DetailWarehouseLocationActivity extends AppCompatActivity {
    ImageView btn;
    TextView tvTitle;
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
    }
}
