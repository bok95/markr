package kr.mar.markr;

import org.apache.cordova.*;

import android.os.Bundle;

public class MarkrActivity extends DroidGap {

	@Override
	public void onCreate(Bundle arg0) {
		// TODO Auto-generated method stub
		super.onCreate(arg0);
		super.loadUrl("file:///android_asset/www/index.html");
	}

	
}
