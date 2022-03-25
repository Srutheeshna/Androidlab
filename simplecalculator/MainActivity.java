package com.example.simplecalculator;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
EditText no1;
EditText no2;
Button add;
Button sub;
Button mul;
Button div;
float ansr=0;
@Override
protected void onCreate(Bundle savedInstanceState) {

9
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
no1=findViewById(R.id.num1);
no2=findViewById(R.id.num2);
add=findViewById(R.id.button);
sub=findViewById(R.id.button2);
mul=findViewById(R.id.button3);
div=findViewById(R.id.button4);
add.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
float a = Float.parseFloat(no1.getText().toString());
float b = Float.parseFloat(no2.getText().toString());
ansr=a+b;
Toast.makeText(MainActivity.this, "Sum is "+ansr,
Toast.LENGTH_SHORT).show();
}
});
sub.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
float a = Float.parseFloat(no1.getText().toString());
float b = Float.parseFloat(no2.getText().toString());
ansr=a-b;
Toast.makeText(MainActivity.this, "Difference is " +ansr,
Toast.LENGTH_SHORT).show();
}
});
mul.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
float a = Float.parseFloat(no1.getText().toString());
float b = Float.parseFloat(no2.getText().toString());
ansr=a*b;
Toast.makeText(MainActivity.this, "Product is "+ansr,
Toast.LENGTH_SHORT).show();

10

}
});
div.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
float a = Float.parseFloat(no1.getText().toString());
float b = Float.parseFloat(no2.getText().toString());
ansr=a/b;
Toast.makeText(MainActivity.this, "Division is "+ansr,
Toast.LENGTH_SHORT).show();
}
});
}
}
