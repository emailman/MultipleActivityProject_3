package edu.dtcc.klochel.multipleactivityproject;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;


public class MyIntentService extends IntentService {

    private static final String TAG = "edu.dtcc.klochel.multipleactivityproject";

    public MyIntentService() {

        super("MyIntentService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Log.i(TAG,"Service Started");
    }
}

