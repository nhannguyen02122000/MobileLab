package com.warehouseapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.warehouseapp.R;

public class MoveProductTwoActivity extends AppCompatActivity {
    RelativeLayout rl;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.move_warehouse_detail);

        rl = findViewById(R.id.rl1);
        rl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MoveProductTwoActivity.this, MoveProductThreeActivity.class));
            }
        });

        btn = findViewById(R.id.btnsignUp);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
