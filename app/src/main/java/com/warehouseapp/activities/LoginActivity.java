package com.warehouseapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import com.warehouseapp.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_role);

        Button admin = findViewById(R.id.button_lir);
        Button quanly = findViewById(R.id.button_2_lir);

        admin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent toLogin = new Intent(LoginActivity.this, LoginInActivity.class);
                startActivity(toLogin);
                finish();
            }
        });

        quanly.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent toLogin = new Intent(LoginActivity.this, LoginInActivity.class);
                startActivity(toLogin);
                finish();
            }
        });

    }
}
