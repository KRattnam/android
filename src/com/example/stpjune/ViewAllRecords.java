package com.example.stpjune;

import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class ViewAllRecords extends Activity implements OnClickListener {
	
	Button shBtn;
	TextView shTv;
	SQLiteDatabase dbv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_view_all_records);
		
		shBtn=(Button)findViewById(R.id.shBtn);
		shBtn.setOnClickListener(this);
		shTv=(TextView)findViewById(R.id.shTv);
	
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v==shBtn)
		{
			dbv=openOrCreateDatabase("DemoDb", MODE_PRIVATE, null);
			//Cursor c=dbv.rawQuery("select * from tab_1", null);
			
			Cursor c=dbv.query(false, "tab_1", null, null, null, null, null, null, null, null);
			String data="";
			while(c.moveToNext())
			{
				data+=c.getString(0)+" , "+c.getString(1)+" , "+c.getString(2)+"\n";
				}
			
			shTv.setText(data);
		}
		}
		
	}
