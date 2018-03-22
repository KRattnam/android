package com.example.stpjune;

import android.app.Activity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class SpinnerActivity extends Activity implements OnItemSelectedListener {

	Spinner sp;
	String [] data={"BTech","MTech","MBA","BBA","BArch"};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_spinner);
		sp=(Spinner)findViewById(R.id.spinner1);
		sp.setOnItemSelectedListener(this);
		
		ArrayAdapter<String>dataAdpt=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,data);
		dataAdpt.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		sp.setAdapter(dataAdpt);
	}
	@Override
	public void onItemSelected(AdapterView<?> parent, View view, int position,
			long id) {
		// TODO Auto-generated method stub
		Toast.makeText(getApplicationContext(), data[position], Toast.LENGTH_LONG).show();
	}
	@Override
	public void onNothingSelected(AdapterView<?> parent) {
		// TODO Auto-generated method stub
		
	}
}
