package com.example.sena.reportacademic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoguinActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loguin);
    }
    public void onClick(View view)
    {
        Intent intent = new Intent(LoguinActivity.this,NavigationDrawerActivity.class);
        startActivity(intent);
    }
    public void CrearCuenta (View view)
    {
        Intent intent = new Intent(LoguinActivity.this,RegisterActivity.class);
        startActivity(intent);
    }
}
