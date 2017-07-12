package com.example.yvtc.yvtc071203;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 0, 1, "Settgings");
        menu.add(0, 1, 2, "About");
        menu.add(0, 2, 3, "Update");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == 0)
        {
            Toast.makeText(MainActivity.this, "Click Settings", Toast.LENGTH_SHORT).show();
        }
        if (item.getItemId() == 1)
        {
            Toast.makeText(MainActivity.this, "Click About", Toast.LENGTH_SHORT).show();
        }
        if (item.getItemId() == 2)
        {
            Toast.makeText(MainActivity.this, "Click Update", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}
