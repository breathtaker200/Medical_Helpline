package com.ishansomani.medicalhelpline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginPatient extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_patient);
        Button button5 = (Button) findViewById(R.id.button5);

        button5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
              switch (v.getId()){
                  case R.id.button5:
                      Intent intent = new Intent(LoginPatient.this , PatientProfile.class);
                      startActivity(intent);
                      break;
              }

    }
}