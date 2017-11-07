package com.example.asus.livelong;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class emergency extends AppCompatActivity {

    Button makeTheCall;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency);
        getSupportActionBar().setTitle("Emergency");

        makeTheCall = (Button) findViewById(R.id.emergencycallbutton);

        makeTheCall.setOnClickListener(new View.OnClickListener()
                                       {
                                           public void onClick(View v)
                                           {
                                               Intent callIntent = new Intent(Intent.ACTION_CALL);
                                               callIntent.setData(Uri.parse("tel:01778856431"));
                                               startActivity(callIntent);
                                           }
                                       });

    }
}
