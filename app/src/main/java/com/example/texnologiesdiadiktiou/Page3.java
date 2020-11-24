package com.example.texnologiesdiadiktiou;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class Page3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);

        button = (Button) findViewById(R.id.buttonNext);
        button.setOnClickListener(new View.OnClickListener()){
            @Override
            public void onClick(View v){
                openPage4();
            };
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);

        button = (Button) findViewById(R.id.buttonBefore);
        button.setOnClickListener(new View.OnClickListener()){
            @Override
            public void onClick(View v){
                openPage2();
            };
        }
    }




    public void openPage4(){
        Intent intent = new intent(this , Page4.class);
        startActivity(intent);

    }

    public void openPage2(){
        Intent intent = new intent(this , Page2.class);
        startActivity(intent);

    }

}