package com.example.eliasandela;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void about_nav(View view)
    {
        Intent intent = new Intent(this,aboutALC.class);
        startActivity(intent);
    }
    public void my_profile(View view)
    {
        Intent intent = new Intent(this,myProfile.class);
        startActivity(intent);
    }
}
