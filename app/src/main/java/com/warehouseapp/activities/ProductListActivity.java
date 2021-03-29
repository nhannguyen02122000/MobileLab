package com.warehouseapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;

import androidx.appcompat.app.AppCompatActivity;

import com.warehouseapp.R;


public class ProductListActivity extends AppCompatActivity {
    ImageView add;
    RelativeLayout sv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.product_list);

        add = findViewById(R.id.imageView4);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ProductListActivity.this,CreateProductActivity.class));
            }
        });

        sv = findViewById(R.id.rl123);
        sv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ProductListActivity.this,ProductDetailActivity.class));
            }
        });
    }
}
