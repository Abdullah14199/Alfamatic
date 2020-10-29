package com.example.alfamatic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void aaa(View view)
    {
        Intent a = new Intent(LoginActivity.this , RegisterActivity.class);
        startActivity(a);
    }
}