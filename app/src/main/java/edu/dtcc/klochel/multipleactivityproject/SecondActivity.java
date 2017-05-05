package edu.dtcc.klochel.multipleactivityproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    private android.os.Bundle savedInstanceState;

    @Override
    protected void onCreate(Bundle SavedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //Get intent
        Intent i = getIntent();

        //Receive the created intent from Main Activity
        String stringReceieved = i.getStringExtra("MESSAGE_KEY");

        //Crete the string into a text view
        TextView tvStringReceived = (TextView) findViewById(R.id.tvCreatedText);
        tvStringReceived.setText(stringReceieved);
    }

    public void onBtnReturn_to_Previous_Screen(View view) {
        Toast.makeText(this, "Previous Screen", Toast.LENGTH_SHORT).show();
    }

    //Return to Main activity
    Intent intent = new Intent(this, MainActivity.class);

    @Override
    public void startActivity(Intent intent) {
        super.startActivity(intent);
    }
}
