package com.example.stpjune;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class AutoCompMainActivity extends Activity {
	
	AutoCompleteTextView ac;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_auto_comp_main);
		
		ac=(AutoCompleteTextView)findViewById(R.id.ac);
		String [] names={"Anup","Amit","Ankit","Shirin","Nikhil"};
		ArrayAdapter<String> adpt=new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,names);
		ac.setAdapter(adpt);
	}
}
