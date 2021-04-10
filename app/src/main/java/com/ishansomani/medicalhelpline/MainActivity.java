package com.ishansomani.medicalhelpline;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText Number;
    private EditText Name;
    private EditText Password;
    private Button Submit;


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.medical_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item1:
                Intent inte = new Intent(MainActivity.this, Ambulance.class);
                startActivity(inte);
                return true;
            case R.id.item2:
                Intent inte1 = new Intent(MainActivity.this, Pharmacy.class);
                startActivity(inte1);
                return true;
            case R.id.item3:
                Intent inte2 = new Intent(MainActivity.this, FirstAid.class);
                startActivity(inte2);
                return true;
            case R.id.item4:
                Intent inte3 = new Intent(MainActivity.this, Expert.class);
                startActivity(inte3);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Number = (EditText) findViewById(R.id.editTextNumber);
        Name = (EditText) findViewById(R.id.editTextTextPersonName2);
        Password = (EditText) findViewById(R.id.editTextTextPassword);
        Submit = (Button) findViewById(R.id.button);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);

        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);

        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n = Name.getText().toString().trim();
                String p = Password.getText().toString().trim();
                String nu = Number.getText().toString().trim();

                if (TextUtils.isEmpty(nu)) {
                    Number.setError("Unique ID Required");
                    return;
                }
                if (TextUtils.isEmpty(n)) {
                    Name.setError("Name Required");
                    return;
                }
                if (TextUtils.isEmpty(p)) {
                    Password.setError("Password is required");
                    return;
                }
                Intent inten = new Intent(MainActivity.this, DoctorView.class);
                startActivity(inten);

            }
        });
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button2:
                Intent intent = new Intent(MainActivity.this, LoginPatient.class);
                startActivity(intent);
                break;
            case R.id.button3:
                Intent intent1 = new Intent(MainActivity.this, RegDoc.class);
                startActivity(intent1);
                break;
            case R.id.button4:
                Intent intent2 = new Intent(MainActivity.this, RegPat.class);
                startActivity(intent2);
                break;
        }
    }
}

