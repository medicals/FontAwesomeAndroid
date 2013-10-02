package com.FontAwesome.Example;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;


public class TextAwesome extends TextView{

	public TextAwesome(Context context) {
		super(context);
		init();
			
	}
	public TextAwesome(Context context,AttributeSet attrs) {
		super(context,attrs);
		init();	
	}
	
	public void init(){
		Typeface font = Typeface.createFromAsset(getContext().getAssets(), "fontawesome-webfont.ttf");
		setTypeface(font);
	}
	
	
}

