package com.warehouseapp.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.warehouseapp.R;

public class ReceiveNoteConfirmActivity extends AppCompatActivity {
    ImageView btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.receivenote_confirmation);
    }
}
