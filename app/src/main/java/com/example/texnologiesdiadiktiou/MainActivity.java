package com.example.texnologiesdiadiktiou;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private Button insertUser;
    private Button insertCom;

public class MainActivity extends ActionBarActivity {
    DatabaseHelper myDb;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acitivity_main);
        insertUser = (Button)findViewById(R.id.insertUserBTN);
        insertCompany =(Button)findViewById(R.id.insertComBTN);
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
        button = (Button) findViewById(R.id.insertComBTN);
        button.setOnClickListener(new View.OnClickListener()){
            @Override
            public void onClick(View v){
                openInsertUser();
            };
        }
        button = (Button) findViewById(R.id.insertUserBTN);
        button.setOnClickListener(new View.OnClickListener()){
            @Override
            public void onClick(View v){
                openInsertCompany();
            };
        }
    }

    public void insertUser(String newEntry){
     boolean insertData = myDb.addData(newEntry);
      if (insertData){
          toastMessage("User Name Inserted");
          else
          {
              toastMessage("Something went wrong");
          }
      }
      public void insertCompany(String newEntry){
            boolean insertData = myDb.addData(newEntry);
            if (insertData){
                toastMessage("Company name  Inserted");
          else
                {
                    toastMessage("Something went wrong");
                }
            }

    }

    public void openPage2(){
        Intent intent = new intent(this , Page2.class);
        startActivity(intent);

    }
        public void openPageUser(){
            Intent intent = new intent(this , Page2.class);
            startActivity(intent);

        }
        public void openPageCompany(){
            Intent intent = new intent(this , Page2.class);
            startActivity(intent);

        }
    //Καλυτερα κοψτε με

}