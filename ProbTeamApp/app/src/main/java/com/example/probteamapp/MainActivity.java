package com.example.probteamapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
public class MainActivity extends AppCompatActivity {
    int currentpg = -1; // -1 = no page, 0 = home pg, 1 = list pg, 2 = setting pg. Used to prevent setting same current view.
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // activity main is home page
        currentpg = 0;
    }
    public void homeClick(View view){
        if (currentpg != 0){
            currentpg = 0;
            setContentView(R.layout.activity_main);
        }
    }
    public void listClick(View view){
        if (currentpg != 1){
            currentpg = 1;
            setContentView(R.layout.activity_list);
        }
    }
    public void settingClick(View view){
        if (currentpg != 2){
            currentpg = 2;
            setContentView(R.layout.activity_setting);
        }
    }
}
