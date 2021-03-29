package com.warehouseapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.warehouseapp.R;

public class LoginInActivity extends AppCompatActivity {
    TextInputEditText tietEmail, tietPass;
    TextInputLayout tilEmail, tilPass;
    Button btnSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        setView();

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logIn(v);
            }
        });

    }

    private void setView() {
        tilEmail = findViewById(R.id.til_user);
        tietEmail = findViewById(R.id.tiet_user);
        tilPass = findViewById(R.id.til_pass);
        tietPass = findViewById(R.id.tiet_pass);
        btnSignIn = findViewById(R.id.btnLogIn_logIn);
    }

    private void requestFocus(View view){
        if (view.requestFocus()){
            getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);
        }
    }

    private boolean validateInput(TextInputLayout til , TextInputEditText tiedt){
        if (tiedt.getText().toString().trim().isEmpty()){
            til.setError(getString(R.string.error_emptyFiled));
            requestFocus(tiedt);
            return false;
        }
        return true;
    }

    private void logIn(View v){
        String email = tietEmail.getText().toString().trim();
        String pass = tietPass.getText().toString().trim();
        if (!validateInput(tilEmail,tietEmail)){
            return;
        }
        else if (!validateInput(tilPass,tietPass)){
            return;
        }
        else if (email.equals("admin") && pass.equals("admin")){
            Toast.makeText(LoginInActivity.this,"Login successful!",Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(LoginInActivity.this,MainActivity.class);
            startActivity(intent);
        }
        else{
            Toast.makeText(LoginInActivity.this,"Login failed! Wrong username or password",Toast.LENGTH_SHORT).show();
        }
    }
}
