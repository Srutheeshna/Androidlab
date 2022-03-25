public class MainActivity extends AppCompatActivity {
Button button;
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
button=findViewById(R.id.button);
button.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
Intent i=new Intent(getApplicationContext(),MainActivity2.class);
startActivity(i);

53

}
});
}
}
