package com.ishansomani.medicalhelpline;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Ambulance extends AppCompatActivity {
    private static final int REQUEST_CALL = 1;
    private Button btn;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ambulance);

        text = findViewById(R.id.textView9);
        btn = findViewById(R.id.button8);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CallButton();
            }
        });

    }

    private void CallButton() {
        String number1 = text.getText().toString();
        if (number1.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(Ambulance.this, Manifest.permission.CALL_PHONE) != getPackageManager().PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(Ambulance.this, new String[]{Manifest.permission.CALL_PHONE} , REQUEST_CALL);
            } else {
                String dial = "Number" + number1;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }


    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        if (requestCode == REQUEST_CALL) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                CallButton();
            } else {
                Toast.makeText(this, "PERMISSION DENIED ", Toast.LENGTH_SHORT).show();
            }
        }
    }
}

