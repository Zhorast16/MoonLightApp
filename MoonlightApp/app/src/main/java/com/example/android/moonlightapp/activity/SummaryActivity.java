package com.example.android.moonlightapp.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.android.moonlightapp.R;

public class SummaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);
        onCreate(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(OrderActivity.this,SummaryActivity.class);
                intent.putExtra("datasurvey",total.getText().toString());
                intent.putExtra(ResultSurveyActivity.DATAKIRIM,1);
                startActivity(intent);
            }
        });
    }
}
