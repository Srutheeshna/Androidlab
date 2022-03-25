public class MainActivity extends AppCompatActivity {
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
}
@Override
public boolean onCreateOptionsMenu(Menu menu) {
getMenuInflater().inflate(R.menu.menu, menu);
return true;
}
@Override
public boolean onOptionsItemSelected(MenuItem item) {
int id = item.getItemId();
switch (id){
case R.id.item1:
Intent i= new
Intent(getApplicationContext(),settings.class);
startActivity(i);
return true;
case R.id.item2:
Intent k= new
Intent(getApplicationContext(),aboutus.class);
startActivity(k);
return true;
case R.id.item3:
Intent j= new
Intent(getApplicationContext(),help.class);
startActivity(j);
return true;
default:
return super.onOptionsItemSelected(item);
}
}
}
