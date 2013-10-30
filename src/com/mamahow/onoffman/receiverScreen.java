package com.mamahow.onoffman;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class receiverScreen extends BroadcastReceiver {
 @Override
 public void onReceive(Context context, Intent intent) {
     if (intent.getAction().equals(Intent.ACTION_SCREEN_ON)){
    	 Log.d("mamahow", "screen on");
     }else{
    	 Log.d("mamahow", "screen off");
     }
 }
}

