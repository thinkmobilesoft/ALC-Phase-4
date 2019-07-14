package com.thinkmobile.alcphase1challengeapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnAbout ;
    private Button btnProfile;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAbout = findViewById(R.id.btn_about);
        btnProfile = findViewById(R.id.btn_profile);

        btnAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenActivity_about();
            }
        });

        btnProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenActivity_profile();
            }
        });
    }

    private void OpenActivity_profile() {
        Intent intent = new Intent(this,MyProfile.class);
        startActivity(intent);
    }

    private void OpenActivity_about() {
        Intent intent = new Intent(this,About.class);
        startActivity(intent);
    }
}
