package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText usrname;
    EditText pass;
    Button log;
    String name = "Admin";
    String ps = "12345";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usrname = findViewById(R.id.username);
        pass = findViewById(R.id.password);
        log = findViewById(R.id.button2);

        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inpName = usrname.getText().toString();
                String inppass = pass.getText().toString();

                if (inpName.isEmpty() || inppass.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Fields are empty", Toast.LENGTH_SHORT).show();
                } else {
                    if ( inpName.equals(name) && inppass.equals(ps)) {
                        Toast.makeText(MainActivity.this, "Success", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(MainActivity.this, "incorrect", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });
    }
}




