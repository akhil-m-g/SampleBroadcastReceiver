package com.test.akhilmg.testcustombroadcastreceiver;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class BroadcastSenderActivity extends AppCompatActivity {

    Button send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broadcast_sender);
        send=(Button)findViewById(R.id.send);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("SEND","Clicked");
                sendBroadCast();
            }
        });
    }

    private void sendBroadCast() {

        Intent intent=new Intent();
        intent.setAction("RECEIVER");
        //intent.setType("text/plain");
        sendBroadcast(intent);
    }
}
