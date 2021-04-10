package com.ishansomani.medicalhelpline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;



public class RegDoc extends AppCompatActivity implements View.OnClickListener {
    EditText name, hosname, pa, gender, pass;
    Button button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg_doc);
        name = findViewById(R.id.editTextTextPersonName6);
        hosname = findViewById(R.id.editTextTextPersonName5);
        pa = findViewById(R.id.editTextTextPostalAddress);
        gender = findViewById(R.id.editTextTextPersonName7);
        pass = findViewById(R.id.editTextTextPassword3);

        Button button6 = (Button) findViewById(R.id.button6);

        button6.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button6:
                Intent intent = new Intent(RegDoc.this, MainActivity.class);
                startActivity(intent);
                break;
        }
    }
}