package com.example.navadroid.androidonclickevent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initInstance();
    }

    private void initInstance() {
        findViewById(R.id.next).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i =  new Intent(this,Option0Activity.class);
        startActivity(i);
    }
}
