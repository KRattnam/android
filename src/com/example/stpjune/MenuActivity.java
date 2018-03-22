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

public class MenuActivity extends ListActivity {

	String [] menuItem={"MainActivity","DatabaseActivity","WebViewActivity","NewActivity","ProgressActivity","RadioActivity","RatingActivity","SpinnerActivity","AutoCompMainActivity","ToggleActivity","AlertDbActivity","AnonBtnActivity","SeekActivity"};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_menu);
		setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1, menuItem));
	}
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		
		String pos=menuItem[position];
		Toast.makeText(getApplicationContext(), pos,Toast.LENGTH_SHORT).show();
		try{
			Class myActivity=Class.forName("com.example.stpjune."+pos);
			Intent i=new Intent (MenuActivity.this,myActivity);
			startActivity(i);
		   }
		catch(Exception e){
			
	}
}
}
