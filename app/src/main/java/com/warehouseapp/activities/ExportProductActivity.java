package com.warehouseapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.warehouseapp.R;

public class ExportProductActivity extends AppCompatActivity {
    Button btn1,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.export_note);

        btn1 = findViewById(R.id.btn_con1);
        btn2 = findViewById(R.id.btn_con2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ExportProductActivity.this, ExportNoteConfirmActivity.class));
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ExportProductActivity.this, ExportNoteConfirmActivity.class));
            }
        });
    }
}
