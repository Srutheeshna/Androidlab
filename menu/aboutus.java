
public class aboutus extends AppCompatActivity {
ImageButton b3;
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_aboutus);
b3=findViewById(R.id.b3);
b3.setOnClickListener(new View.OnClickListener()
{
@Override
public void onClick(View v) {
Intent i= new
Intent(getApplicationContext(),MainActivity.class);
startActivity(i);
}
});
}
}
