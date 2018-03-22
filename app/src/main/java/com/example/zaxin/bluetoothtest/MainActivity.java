package com.example.zaxin.bluetoothtest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Zaxin on 18/03/2018.
 */

public class MainActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void serverMode(View view) {
        Intent intent = new Intent(MainActivity.this, ServerActivity.class);
               startActivity(intent);

    }

    public void clientMode(View view) {
        Intent intent = new Intent(MainActivity.this, ClientActivity.class);
        startActivity(intent);
    }
}
