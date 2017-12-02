package com.example.android.moonlightapp.activity;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;
import com.example.android.moonlightapp.R;

public class OrderActivity extends AppCompatActivity {
    int harganasgor, hargamiegor, hargamiereb, hargagtea, hargachoco, hargamoon;
    int jml, total;
    CheckBox nasgor, miegor, miereb, gtea, choco, moon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        EditText harganasgor = findViewById(R.id.qty1);
        EditText hargamiegor = findViewById(R.id.qty2);
        EditText hargamiereb = findViewById(R.id.qty3);
        EditText hargagtea = findViewById(R.id.qty4);
        EditText hargachoco = findViewById(R.id.qty5);
        EditText hargamoon = findViewById(R.id.qty6);
        Button orders = (Button) findViewById(R.id.btnOrder);
        nasgor = findViewById(R.id.nasgor);
        miegor = findViewById(R.id.miegor);
        miereb = findViewById(R.id.miereb);
        gtea = findViewById(R.id.gtea);
        choco = findViewById(R.id.choco);
        moon = findViewById(R.id.moon);
        Intent intent = new Intent(OrderActivity.this, SummaryActivity.class);
        startActivity(intent);
    }
    @Override
    public boolean onOptionsItemSelected (MenuItem menuItem) {
        if (menuItem.getItemId() == android.R.id.home) {
            Log.e("Home pressed", "home pressed");
            Toast.makeText(OrderActivity.this, "kembali ke menu utama", Toast.LENGTH_SHORT).show();
            onBackPressed();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    private int Total(int order){
        if (nasgor.isChecked())
            jml+=harganasgor*10000;
        if (miegor.isChecked())
            jml+=hargamiegor*9000;
        if (miegor.isChecked())
            jml+=hargamiereb*8000;
        if (gtea.isChecked())
            jml+=hargagtea*5000;
        if (choco.isChecked())
            jml+=hargachoco*15000;
        if (moon.isChecked())
            jml+=hargamoon*25000;
        return total = jml;
    }
}
