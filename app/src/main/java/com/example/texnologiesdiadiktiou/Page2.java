package com.example.texnologiesdiadiktiou;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SearchView;

public class Page2 extends AppCompatActivity {
    private SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        //pros8iki Scroll view

        public boolean onQueryTextSubmit(String query)
        {
            ArrayList<>();

            for (String user: listItem)
            {
                if (user.toLowerCase().contains(newText.toLowerCase()))
                {
                    userlist.add(user);
                }
            }

            ArrayAdapter<String> useradapter = new ArrayAdapter<String>(context: MainActivity.this,
                android.R.layout.simple_list_item_1, userlist);
            userlist.setAdapter(adapter);

            return true;
        }
    }
}