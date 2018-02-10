package com.example.user.mapdemo1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    String tag = "Events";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        findViewById(R.id.btn_play_again).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // We normally won't show the welcome slider again in real app
                // but this is for testing
                PrefManager prefManager = new PrefManager(getApplicationContext());

                // make first time launch TRUE
                prefManager.setFirstTimeLaunch(true);

                startActivity(new Intent(MainActivity.this, WelcomeActivity.class));
                finish();
            }
        });

       Log.d(tag, "In the onCreate() event");
    }

    public void edubutton(View view) {


           //     startActivity(new Intent("EducationalActivity"));
        Intent intent = new Intent(MainActivity.this,EducationalActivity.class);
        startActivity(intent);



    }

    public void atmbutton(View view) {
        Intent intent = new Intent(MainActivity.this,Atm.class);
        startActivity(intent);
    }

    public void hospitalbutton(View view) {
        Intent intent = new Intent(MainActivity.this,hospitals.class);
        startActivity(intent);
    }

    public void bankbutton(View view) {
        Intent intent = new Intent(MainActivity.this,banks.class);
        startActivity(intent);
    }

    public void busbutton(View view) {
        Intent intent = new Intent(MainActivity.this,reastaurants.class);
        startActivity(intent);
    }
}
