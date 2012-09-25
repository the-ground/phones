package com.example.groundmag;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import org.apache.cordova.*;
import android.view.WindowManager;
import android.view.KeyEvent;

public class MainActivity extends DroidGap {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().clearFlags(WindowManager.LayoutParams.FLAG_FORCE_NOT_FULLSCREEN); getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        super.loadUrl("file:///android_asset/www/index.html");
    }
/*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    } */

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if (keyCode == KeyEvent.KEYCODE_BACK) { // disable back button
			//super.loadUrl("file:///android_asset/www/index.html");
			return true;
		}
		if (keyCode == KeyEvent.KEYCODE_MENU) { // disable menu button
			return true;
		}
		if (keyCode == KeyEvent.KEYCODE_HOME) { // disable home button
			return true;
		}		
		return super.onKeyDown(keyCode, event);
		
	}
    
}
