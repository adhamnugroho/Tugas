package com.belajar;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import android.widget.Button;

public class Autocomplete_biodata extends Activity implements TextWatcher, OnClickListener {
	
	TextView entryNama, entryAlamat;
	AutoCompleteTextView entryKotaKab, entryAgama, entryHobi;
	Button tombolErase;
	
	
	
	//list AutoComplete
	String[] listKotaKab = {
			"Mojokerto", "Malang", "Madiun", "Surabaya", "Nganjuk", "Banyuwangi",
			"Jakarta", "Bekasi", "Bogor", "Depok", "Pekanbaru", "Medan", "Palembang",
			"Ambon", "Palu", "Jayapura"
	};
	String[] listAgama = {
			"Islam", "Kristen", "Katholik", "Hindu", "Budha", "Konghuchu",
			"Satanic"
	};
	String[] listHobi = {
			"Bersepeda", "Berenang", "Basket", "Sepak bola", "Makan", "Tidur",
			"Ngoding", "Bersantai", "Membaca", "Memancing", "Ngegame", "Ngedit",
			"Menghitung", "Melamun"
	};
	
	
	//Called when activity is first created
	
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_autocomplete_biodata);
		
		//Nama
		entryNama = (TextView) findViewById(R.id.entryNama);
		
		//Alamat		
		entryAlamat = (TextView) findViewById(R.id.entryAlamat);
		
		//Kota/Kab	
		entryKotaKab = (AutoCompleteTextView) findViewById(R.id.entryKotaKab);
		entryKotaKab.addTextChangedListener(this);
		entryKotaKab.setAdapter(new ArrayAdapter<String> (
				this, android.R.layout.simple_dropdown_item_1line, listKotaKab
			)
		);
		
		//Agama
		entryAgama = (AutoCompleteTextView) findViewById(R.id.entryAgama);
		entryAgama.addTextChangedListener(this);
		entryAgama.setAdapter(new ArrayAdapter<String> (
				this, android.R.layout.simple_dropdown_item_1line, listAgama
			)
		);
		
		//Hobi	
		entryHobi = (AutoCompleteTextView) findViewById(R.id.entryHobi);
		entryHobi.addTextChangedListener(this);
		entryHobi.setAdapter(new ArrayAdapter<String> (
				this, android.R.layout.simple_dropdown_item_1line, listHobi
			)
		);
		
		//Tombol Hapus	
		tombolErase = (Button) findViewById(R.id.tombolHapus);
		tombolErase.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				entryNama.setText("");
				entryAlamat.setText("");
				entryKotaKab.setText("");
				entryAgama.setText("");
				entryHobi.setText("");
				entryNama.requestFocus();
			}
		});
	}

	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		
		//Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.autocomplete_biodata, menu);
		return true;
	}
	
	
	@Override
	public void afterTextChanged(Editable arg0) {
		//TODO Auto - generated method stub		
	}
	
	
	@Override
	public void beforeTextChanged(CharSequence args0, int arg1, int arg2, int arg3) {
		//TODO Auto - generated method stub		
	}


	@Override
	public void onTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
	}

}
