package com.FontAwesome.Example;

import android.app.Activity;
import android.os.Bundle;
import android.util.TypedValue;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		LinearLayout layoutMain = (LinearLayout) findViewById(R.id.layoutMain);
		
		//add a view programmatically
		TextAwesome tvFacebook = new TextAwesome(this);
		tvFacebook.setText(this.getResources().getString(R.string.icon_facebook_sign));
		tvFacebook.setTextSize(TypedValue.COMPLEX_UNIT_SP,50);
		
		layoutMain.addView(tvFacebook, new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
		
		TextAwesome tvGoog = new TextAwesome(this);
		tvGoog.setText(this.getResources().getString(R.string.icon_google_plus_sign));
		tvGoog.setTextSize(TypedValue.COMPLEX_UNIT_SP,50);
		

		layoutMain.addView(tvGoog, new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
	}

}
