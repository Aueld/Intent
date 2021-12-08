package com.example.intentdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        String str = "action: " + intent.getAction() + "\n";
        str += "uri: " + intent.getData() + "\n";
        str += "category: " + intent.getCategories() + "\n";
        str += "type: " + intent.getType() + "\n";
        str += "class: " + intent.getComponent() + "\n";
        str += "extras: " + intent.getExtras() + "\n";
        str += "pakage: " + intent.getPackage();

        TextView tv = findViewById(R.id.info);
        tv.setText(str);
    }
}