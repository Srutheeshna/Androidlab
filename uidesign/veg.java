
public class veg extends AppCompatActivity {
Button button2;
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_veg);
button2=findViewById(R.id.button2);
button2.setOnClickListener(new View.OnClickListener() {

54

@Override
public void onClick(View v) {
Intent i=new Intent(String.valueOf(MainActivity2.class));
startActivity(i);
}
});
}
}
