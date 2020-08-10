package com.example.texttool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {
    private Button b1;
    private Button b2;
    private Button b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        b3 = (Button) findViewById(R.id.b3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open3();
            }
        });
        b2 = (Button) findViewById(R.id.b2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open2();
            }
        });
        b1 = (Button) findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open1();
            }
        });
    }

    public void open3() {
        Intent intent = new Intent(this, thirdActivity.class);
        startActivity(intent);
    }

    public void open2() {
        Intent intent = new Intent(this, secondActivity.class);
        startActivity(intent);
    }

    public void open1() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
