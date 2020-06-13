package com.androidproject.budgetandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button but1;
    private Button but2;
    private Button but3;
    private Button but4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        but1 = (Button) findViewById(R.id.button1);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createFacture();
            }


        });
        but2 = (Button) findViewById(R.id.button2);
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                factureNonpayer();
            }
        });
        but3 = (Button) findViewById(R.id.button3);
        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                facturePayer();
            }
        });
        but4 = (Button) findViewById(R.id.button4);
        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                help();
            }
        });
    }
    public void createFacture(){
        Intent intent = new Intent(this , AddfacActivity.class);
        startActivity(intent);
    }
    public void factureNonpayer(){
        Intent intent = new Intent(this , ConsulterfacActivity.class);
        startActivity(intent);
    }
    public void facturePayer(){
        Intent intent = new Intent(this , AproposfacActivity.class);
        startActivity(intent);
    }
    public void help(){
        Intent intent = new Intent(this , HelpActivity.class);
        startActivity(intent);
    }
}

