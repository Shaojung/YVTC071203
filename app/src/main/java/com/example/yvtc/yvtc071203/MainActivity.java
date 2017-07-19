package com.example.yvtc.yvtc071203;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.textView);
        registerForContextMenu(tv);
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

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.add("AA");
        menu.add("BBBBB");
        menu.add("CCCC");
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        if (item.getTitle().equals("AA"))
        {
            Toast.makeText(MainActivity.this, "AA Clicked", Toast.LENGTH_SHORT).show();
        }
        return super.onContextItemSelected(item);
    }
}
