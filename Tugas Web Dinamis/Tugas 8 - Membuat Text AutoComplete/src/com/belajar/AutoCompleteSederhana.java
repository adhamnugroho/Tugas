package com.belajar;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

public class AutoCompleteSederhana extends Activity implements TextWatcher{
	
	// Called when the activity is first created.
	
	TextView hasil;
	AutoCompleteTextView edit;
	
	
	
	//list AutoComplete
	String[] item = {
			"Merbabu", "Merapi", "Lawu", "Rinjani", "Sumbing", "Krakatau", "Selat Sunda",
			"Selat Sumbing", "Sindoro", "Krakatau", "Selat Sunda", "Selat Bali",
			"Selat Malaka", "Kalimatan", "Sulawesi", "Jawa", "Android Programming",
			"Web Programming", "UI Designer", "UX Designer", "Web Developer",
			"Android Developer", "Programmer", "Full Stack Developer", "Front End Developer",
			"Back End Developer", "Web Designer", "Server", "Adham Prasetyo Suryo Nugroho",
			"Syntax", "Paradigma Prosedural", "Paradigma Object Oriented", "Mobile Programming",
			"Mobile Developer", "IOS Developer", "IOS Programming"
	};
	
	
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_auto_complete_sederhana);
		
		
		hasil = (TextView) findViewById(R.id.hasil);
		edit = (AutoCompleteTextView) findViewById(R.id.edit);
		edit.addTextChangedListener(this);
		edit.setAdapter(new ArrayAdapter<String> (
				this, android.R.layout.simple_dropdown_item_1line, item
			)
		);
	}
	
	
	public void onTextChanged(CharSequence s, int start, int before, int count) {
		hasil.setText(edit.getText());
	}
	
	
	public void beforeTextChanged(CharSequence s, int start, int count, int after) {
		
		// not used
	}
	
	
	public void afterTextChanged(Editable s) {
		
		// not used	
	}
}