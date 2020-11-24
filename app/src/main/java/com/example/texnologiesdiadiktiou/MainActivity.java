package com.example.texnologiesdiadiktiou;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private Button button;

public class MainActivity extends ActionBarActivity {
    DatabaseHelper myDb;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acitivity_main);
        myDb = new DatabaseHelper(this);

    }
    @Override
public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
        @Override
public boolean onOptionsItemSelected(Menuitem , item) {
    int id = item.getItemId();


    }
}


}


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.nextBTN);
        button.setOnClickListener(new View.OnClickListener()){
            @Override
            public void onClick(View v){
                openPage2();
            };
        }
    }

    public void openPage2(){
        Intent intent = new intent(this , Page2.class);
        startActivity(intent);

    }
    //Καλυτερα κοψτε με

}