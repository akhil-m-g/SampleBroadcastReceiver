package com.test.akhilmg.testcustombroadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by AKHIL MG on 25-04-2016.
 */
public class BroadcastReceiverActivity extends AppCompatActivity {

    private static final String TAG = "BroadcastReceiverActivity";
   // private ReceiveBroadcast receiveBroadcast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // receiveBroadcast=new ReceiveBroadcast();
        //registerReceiver(receiveBroadcast, IntentFilter.create("RECEIVER","text/plain"));

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //unregisterReceiver(receiveBroadcast);
    }

    public static class ReceiveBroadcast extends BroadcastReceiver {


        @Override
        public void onReceive(Context context, Intent intent) {
            Log.e(TAG, "onReceive called");
            Toast.makeText(context, "Broadcast Received", Toast.LENGTH_SHORT).show();
        }
    }
}
