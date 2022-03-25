package com.example.validation;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
    EditText username;
    EditText age;
    EditText phone;
    EditText pass;
    Button b1;
    Pattern USERNAME_PATTERN=Pattern.compile("^[A-Za-z]\\w{5,30}$");    //Alphabets 6-30 letters
    Pattern PASSWORD_PATTERN =Pattern.compile("^" +
            "(?=.*[@#$%^&+=])" +     // at least 1 special character
            "(?=\\S+$)" +            // no white spaces
            ".{8,}" +                  // at least 4 characters
            "(.*[0-9].*)"+              //number
            "(.*[A-Z].*)"+              //uppercase
            "$");
    Pattern AGE_PATTERN=Pattern.compile("^"+
            ("(?=\\S+$)")+
            "[0-9]{1,2}"+
            "$");
    Pattern PHONE_PATTERN=Pattern.compile("^(0|91)?[7-9][0-9]{9}$");       //Begins with 0 or 91,then 7 or 8 or 9,then contains 9 digits


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username=findViewById(R.id.name);
        age=findViewById(R.id.age);
        phone=findViewById(R.id.phone);
        pass=findViewById(R.id.pass);
        b1=findViewById(R.id.button);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inpName=username.getText().toString();
                String inpAge=age.getText().toString();
                String inpPh=phone.getText().toString();
                String inpPass=pass.getText().toString();


                if(inpName.isEmpty()){
                    Toast.makeText(MainActivity.this,  "Name Field is Empty", Toast.LENGTH_SHORT).show();
                }
                if(inpAge.isEmpty()){
                    Toast.makeText(MainActivity.this,  "Age field is Empty", Toast.LENGTH_SHORT).show();
                }
                if(inpPh.isEmpty()){
                    Toast.makeText(MainActivity.this,  "Phone field is Empty", Toast.LENGTH_SHORT).show();
                }
                if(inpPass.isEmpty()){
                    Toast.makeText(MainActivity.this,  "Pass field is Empty", Toast.LENGTH_SHORT).show();
                }
                if (!USERNAME_PATTERN.matcher(inpName).matches()){
                    username.setError("Enter alphabets [6-30 characters]");
                }
                if (!AGE_PATTERN.matcher(inpAge).matches()){
                    age.setError("Enter only 2 digits");
                }
                if (!PHONE_PATTERN.matcher(inpPh).matches()){
                    phone.setError("Contains only 10 digits");
                }
                if (!PASSWORD_PATTERN.matcher(inpPass).matches()){
                    pass.setError("Password is too weak[must contain capital letter,small letter,digits and special characters]");
                }
                else Toast.makeText(MainActivity.this, "Success", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
