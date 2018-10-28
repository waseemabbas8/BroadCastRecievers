package com.thetasolutions.broadcastrecievers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.widget.Toast;

public class PhoneBroadCastRecevier extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Bundle extras = intent.getExtras(); // used to get data from intent
        //used to handle any null pointer exception
        if (extras!=null){
            String state = extras.getString(TelephonyManager.EXTRA_STATE);
            Toast.makeText(context, ""+state, Toast.LENGTH_SHORT).show();
        }
    }
}
