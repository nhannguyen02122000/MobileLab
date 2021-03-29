package com.warehouseapp.activities;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.warehouseapp.R;

public class ExportNoteConfirmActivity extends AppCompatActivity {
    ImageView btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exportnote_confirmation);
    }
}
