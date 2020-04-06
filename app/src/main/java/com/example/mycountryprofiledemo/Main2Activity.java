package com.example.mycountryprofiledemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.MenuItem;

public class Main2Activity extends AppCompatActivity {
    private ImageView imageView;
    private TextView textView;
    public boolean item;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        getSupportActionBar().setTitle("Details");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

         imageView = (ImageView) findViewById(R.id.imageviewId);
         textView = (TextView) findViewById(R.id.textviewId);

         Bundle bundle = getIntent().getExtras();
         if(bundle!=null)
         {
             String countryName = bundle.getString("name");
             showDetails(countryName);
         }
    }

    public boolean onOptionsItemSelected(MenuItem item) {

        //Ends the activity
        if (item.getItemId() == android.R.id.home) {
            //ends activity
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }

    void showDetails(String countryName)
    {
        if(countryName.equals("bangladesh"))
        {
            imageView.setImageResource(R.drawable.bangladesh_dhaka);
            textView.setText(R.string.bangladesh_details);
        }
        if(countryName.equals("india"))
        {
           imageView.setImageResource(R.drawable.india_parlament);
           textView.setText(R.string.india_details);
        }
        if(countryName.equals("pakistan"))
        {
            imageView.setImageResource(R.drawable.pakistan_parlament);
            textView.setText(R.string.pakistan_details);
        }
    }
}
