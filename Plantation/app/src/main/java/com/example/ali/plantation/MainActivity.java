package com.example.ali.plantation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button btn_plants,btn_vegetables;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_plants=(Button)findViewById(R.id.btn_plant);

        btn_vegetables=(Button)findViewById(R.id.btn_vegetable);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

btn_plants.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Activity_GlobalVariable.SELECTTYPE="1";
        Intent intent=new Intent(MainActivity.this,Activity_getlist.class);
        startActivity(intent);
    }
});
        btn_vegetables.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Activity_GlobalVariable.SELECTTYPE="2";

                Intent intent=new Intent(MainActivity.this,Activity_getlist.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
        moveTaskToBack(true);
    }
}
