package com.example.kanna.intentex;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void dial(View view) {
        Intent i= new Intent();
        EditText et = findViewById(R.id.et1);
        i.setData(Uri.parse("tel:"+et.getText().toString()));
        i.setAction(Intent.ACTION_DIAL);
        startActivity(i);
    }

    public void next(View view) {
        Intent i = new Intent(this,WelcomeActivity.class);
        EditText et2 = findViewById(R.id.et2);
        EditText et3 = findViewById(R.id.et3);
        i.putExtra("name",et2.getText().toString());
        i.putExtra("qual",et3.getText().toString());
        startActivity(i);
    }

    public void WhatsApp(View view) {
        Intent i = getPackageManager().getLaunchIntentForPackage("com.application.zomato");
        if(i!=null)
        {
            startActivity(i);
        }
        else
        {
            Intent i1= new Intent();
            i1.setAction(Intent.ACTION_VIEW);
            i1.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.application.zomato"));
            startActivity(i1);
        }
    }
}
