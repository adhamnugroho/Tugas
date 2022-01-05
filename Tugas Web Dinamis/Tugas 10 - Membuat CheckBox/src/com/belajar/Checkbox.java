package com.belajar;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

public class Checkbox extends Activity implements OnCheckedChangeListener{
	
	CheckBox checkBox;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_checkbox);
		
		checkBox = (CheckBox)findViewById(R.id.check);
		checkBox.setOnCheckedChangeListener(this);
	}
	
	public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
		//Pengkondisian
		if(isChecked) {
			checkBox.setText("checkBox ini: Dicentang!");
		} else {
			checkBox.setText("CheckBox ini: Tidak Dicentang!");
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.checkbox, menu);
		return true;
	}

}
