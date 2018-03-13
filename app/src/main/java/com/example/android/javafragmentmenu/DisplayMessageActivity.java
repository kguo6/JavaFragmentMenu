package com.example.android.javafragmentmenu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_message_activity);

        Intent intent = getIntent();
        String message = intent.getStringExtra(TextField.EXTRA_MESSAGE);
        System.out.println(message);
        TextView textView = findViewById(R.id.textView);
        textView.setText(message);
    }
}
