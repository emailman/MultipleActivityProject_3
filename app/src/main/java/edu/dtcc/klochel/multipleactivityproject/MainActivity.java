package edu.dtcc.klochel.multipleactivityproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    //Create message key
    public static String Message_KEY = "MESSAGE_KEY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = new Intent(this, MyIntentService.class);
        startService(intent);
    }

    public void onBtnCreateTextClick(View view)
    {

        //Create an intent
        Intent intent = new Intent(this, SecondActivity.class);

        //Start Activity
        startActivity(intent);

        //Create a toast message
        Toast.makeText(this, "Text Created", Toast.LENGTH_LONG).show();

        //Get user created string
        EditText etMainEditText = (EditText) findViewById(R.id.tvCreatedText);
        String createdString = etMainEditText.getText().toString();

        //Start MyIntentService
        Intent intent2 = new Intent(this, MyIntentService.class);
        startService(intent2);

        }
    }
