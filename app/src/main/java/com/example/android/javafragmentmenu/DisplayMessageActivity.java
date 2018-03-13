package com.example.android.javafragmentmenu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class DisplayMessageActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.text_field);

        Intent intent = getIntent();
        String message = intent.getStringExtra(TextField.EXTRA_MESSAGE);
    }
}
