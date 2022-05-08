package com.example.smart_fridge20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button btn = findViewById(R.id.product_list_btn);


        Intent intent = new Intent(this, MainActivity.class);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    startActivity(intent);
            }
        });


        Button btn2 = findViewById(R.id.product_buy_btn);

        Intent intent2 = new Intent(this,OrderActivity.class);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent2);
            }
        });

        Button exit_btn = (Button) findViewById(R.id.exit_btn);
        exit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}