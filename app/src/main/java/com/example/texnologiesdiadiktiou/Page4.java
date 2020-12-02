package com.example.texnologiesdiadiktiou;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class Page4 extends AppCompatActivity {

    Private Button backToThePast;
    Private Button backToStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page4);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page4);

        backToThePast = (Button) findViewById(R.id.buttonGenerate);
        backToThePast.setOnClickListener(new View.OnClickListener()){

            public void onClick(View v){
                openPage3();
            };

        }

        backToStart = (Button) findViewById(R.id.buttonBack);
        backToStart.setOnClickListener(new View.OnClickListener()){

            public void onClick(View v){
                openPage1();
            };

    }

    public void openPage3(){
        Intent intent = new intent(this , Page3.class);
        startActivity(intent);

    }

        public void openPage1(){
            Intent intent = new intent(this , MainActivity.class);
            startActivity(intent);

        }

}