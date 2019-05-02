package com.example.sqlite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText etWord, etMeaning;
    Button btnAddWord;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etWord = findViewById(R.id.etWord);
        etMeaning = findViewById(R.id.etMeaning);
        btnAddWord = findViewById(R.id.btnAddWord);

    }
}
