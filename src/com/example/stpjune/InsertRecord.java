package com.example.stpjune;

import android.app.Activity;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class InsertRecord extends Activity implements OnClickListener{
	
	Button cb,sb;
	EditText net,pet,uet;
	SQLiteDatabase db;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_insert_record);
		
		cb=(Button)findViewById(R.id.cb);
		cb.setOnClickListener(this);
		sb=(Button)findViewById(R.id.sb);
		sb.setOnClickListener(this);
		net=(EditText)findViewById(R.id.net);
		pet=(EditText)findViewById(R.id.pet);
		uet=(EditText)findViewById(R.id.uet);
		//db.openOrCreateDatabase("Demodb1",null);
	}


	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		db=openOrCreateDatabase("DemoDb", MODE_PRIVATE,null);
		if(v==cb)
		{
			
			db.execSQL("create table if not exists tab_1 (u_id int(5),name varchar(20),pwd varchar(20))");
			//db.execSQL("insert into tab_1 values(1001,'Sachin','Hp@123')");
			
			Toast.makeText(getApplicationContext(),"Create Database", 100).show();
			
		}
		if(v==sb)
		{
			Toast.makeText(getApplicationContext(),"Submit", 100).show();
			ContentValues cv=new ContentValues();
			cv.put("u_id", Integer.parseInt(uet.getText().toString()));
			cv.put("name", net.getText().toString());
			cv.put("pwd", pet.getText().toString());
		    db.insert("tab_1", null, cv);
			//db.execSQL("insert into tab_1 values("+uet.getText()+",'"+net.getText().toString()+"','"+pet.getText().toString()+"');");
	}
	}
}
