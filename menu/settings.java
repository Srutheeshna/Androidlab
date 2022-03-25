public class settings extends AppCompatActivity {

45

ImageButton b;
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_settings);
b=findViewById(R.id.button);
b.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
Intent i= new
Intent(getApplicationContext(),MainActivity.class);
startActivity(i);
}
});
}
}
