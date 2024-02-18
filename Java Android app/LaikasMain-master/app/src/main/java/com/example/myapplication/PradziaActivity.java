package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class PradziaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pradzia);

        final Button button = (Button) findViewById(R.id.button4);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent i = new Intent(getApplicationContext(), TrenerisActivity.class);
                startActivity(i);

            }
        });
    }

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.pradzia);
//
//    }
//    public void i_treneris_psl (View view)
//    {
//        Intent intent = new Intent(this, treneris_psl.class);
//        startActivity(intent);
//        DataBaseHelper dataBaseHelper = new DataBaseHelper( PradziaActivity.this);
//    }
}