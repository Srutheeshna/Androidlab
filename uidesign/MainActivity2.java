public class MainActivity2 extends AppCompatActivity {
Button button;
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main2);
button=findViewById(R.id.button3);
button.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
Intent i=new Intent(getApplicationContext(),veg.class);
startActivity(i);
}
});
}
}
