package com.example.mycountryprofiledemo;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
     private Button bangladeshButton,pakisthanButton,indiaButton;
   private Intent intent;
   private long backpressedTime;
   private boolean item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bangladeshButton= (Button)findViewById(R.id.bangladesh_buttonID);
        pakisthanButton= (Button) findViewById(R.id.pakistan_buttonID);
        indiaButton = (Button) findViewById(R.id.india_buttonId);
        bangladeshButton.setOnClickListener(this);
        pakisthanButton.setOnClickListener(this);
        indiaButton.setOnClickListener(this);

    }

    @Override
    public void onBackPressed() {


        if(backpressedTime + 2000>System.currentTimeMillis())
        {
            super.onBackPressed();
            return;
        }
        else
        {
            Toast.makeText(getBaseContext(),"Press back again to exit",Toast.LENGTH_SHORT).show();

        }
        backpressedTime = System.currentTimeMillis();
    }

    @Override
    public void onClick(View v) {
    if(v.getId()==R.id.bangladesh_buttonID)
    {
        intent = new Intent(MainActivity.this,Main2Activity.class);
        intent.putExtra("name","bangladesh");
        startActivity(intent);
    }
    if (v.getId()==R.id.pakistan_buttonID)
    {
        intent = new Intent(MainActivity.this,Main2Activity.class);
        intent.putExtra("name","pakistan");
        startActivity(intent);
    }
    if(v.getId()==R.id.india_buttonId)
    {
        intent = new Intent(MainActivity.this,Main2Activity.class);
        intent.putExtra("name","india");
        startActivity(intent);
    }
    }
}
