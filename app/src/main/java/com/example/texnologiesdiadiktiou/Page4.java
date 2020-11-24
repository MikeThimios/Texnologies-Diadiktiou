package com.example.texnologiesdiadiktiou;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class Page4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page4);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);

        button = (Button) findViewById(R.id.buttonPrevious);
        button.setOnClickListener(new View.OnClickListener()){
            @Override
            public void onClick(View v){
                openPage3();
            };
        }
    }

    public void openPage3(){
        Intent intent = new intent(this , Page2.class);
        startActivity(intent);

    }
}