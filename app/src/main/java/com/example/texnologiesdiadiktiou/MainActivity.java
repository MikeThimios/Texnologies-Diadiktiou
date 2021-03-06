package com.example.texnologiesdiadiktiou;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.Menu;



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
        insertCom =(Button)findViewById(R.id.insertComBTN);
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
        button.setOnClickListener(new View.OnClickListener()) {
            @Override
            public void onClick (View v){
                openPage2();
            }
            ;
        }
        insertCom = (Button) findViewById(R.id.insertComBTN);
        insertCom.setOnClickListener(new View.OnClickListener()) {
            @Override
            public void onClick (View v){
                openInsertUser();
            }
            ;
        }
        insertUser = (Button) findViewById(R.id.insertUserBTN);
        insertUser.setOnClickListener(new View.OnClickListener()) {
            @Override
            public void onClick (View v){
                openInsertCompany();
            }
            ;
        }
    }

    public void insertUser(String newEntry) {
        boolean insertData = myDb.addData(newEntry);
        if (insertData) {
            toastMessage("User Name Inserted");
          else
            {
                toastMessage("Something went wrong");
            }
        }
        public void insertCompany (String newEntry){
            boolean insertData = myDb.addData(newEntry);
            if (insertData) {
                toastMessage("Company name  Inserted");
          else
                {
                    toastMessage("Something went wrong");
                }
            }

        }

        public void openPage2 () {
            Intent intent = new intent(this, Page2.class);
            startActivity(intent);

        }
        public void openinsertUser () {
            Intent intent = new intent(this, InsertUser.class);
            startActivity(intent);

        }
        public void openinsertCom () {
            Intent intent = new intent(this, InsertCompany.class);
            startActivity(intent);

        }


    }
}