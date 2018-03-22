package com.example.stpjune;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class DatabaseActivity extends ListActivity {
	
	String [] option={"InsertRecord","ViewAllRecords","UpdateRecord","DeleteRecord"};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_database);
		setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1, option));
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		
		String pos=option[position];
		Toast.makeText(getApplicationContext(), pos,Toast.LENGTH_SHORT).show();
		try{
			Class myActivity=Class.forName("com.example.stpjune."+pos);
			Intent i=new Intent (DatabaseActivity.this,myActivity);
			startActivity(i);
		   }
		catch(Exception e){
			
	}
	}
	
}
