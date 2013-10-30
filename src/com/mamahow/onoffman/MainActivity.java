package com.mamahow.onoffman;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {
    
     @Override
       public void onCreate(Bundle savedInstanceState) {
	       super.onCreate(savedInstanceState);
	       setContentView(R.layout.simple_list_item_1);
	       startService(new Intent (this, serviceScreen.class));
     }
    }