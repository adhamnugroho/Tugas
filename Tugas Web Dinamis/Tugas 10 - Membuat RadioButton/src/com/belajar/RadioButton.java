package com.belajar;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.RadioGroup;

public class RadioButton extends Activity implements RadioGroup.OnCheckedChangeListener{
	
	//	Called when the activity is first created
	
	RadioGroup orientation;
	RadioGroup gravity;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_radio_button);
		
		orientation = (RadioGroup) findViewById(R.id.orientation);
		orientation.setOnCheckedChangeListener(this);
		gravity = (RadioGroup) findViewById(R.id.gravity);
		gravity.setOnCheckedChangeListener(this);
	}
	
	public void onCheckedChanged(RadioGroup group, int checkId) {
		switch(checkId){
			case R.id.horizontal:
				orientation.setOrientation(LinearLayout.HORIZONTAL);
				break;
				
			case R.id.vertical:
				orientation.setOrientation(LinearLayout.VERTICAL);
				break;
				
			case R.id.kiri:
				gravity.setGravity(Gravity.LEFT);
				break;
				
			case R.id.tengah:
				gravity.setGravity(Gravity.CENTER);
				break;
				
			case R.id.kanan:
				gravity.setGravity(Gravity.RIGHT);
				break;
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.radio_button, menu);
		return true;
	}
}
