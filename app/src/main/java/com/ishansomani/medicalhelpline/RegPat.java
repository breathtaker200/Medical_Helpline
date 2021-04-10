package com.ishansomani.medicalhelpline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegPat extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg_pat);
        Button button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button7:
                Intent intent = new Intent(RegPat.this, LoginPatient.class);
                startActivity(intent);
                break;
        }
    }
}