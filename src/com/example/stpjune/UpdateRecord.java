package com.example.stpjune;

import android.app.Activity;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class UpdateRecord extends Activity implements OnClickListener{
	
	Button ub,shb;
	EditText uet1,uet2,uet3,uet4;
	SQLiteDatabase udb;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_update_record);
		ub=(Button)findViewById(R.id.ub);
		ub.setOnClickListener(this);
		shb=(Button)findViewById(R.id.shb);
		shb.setOnClickListener(this);
		
		uet1=(EditText)findViewById(R.id.uet1);
		uet2=(EditText)findViewById(R.id.uet2);
		uet3=(EditText)findViewById(R.id.uet3);
		uet4=(EditText)findViewById(R.id.uet4);
	}


	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		udb=openOrCreateDatabase("DemoDb", MODE_PRIVATE,null);
		int id=Integer.parseInt(uet4.getText().toString());
		if(v==shb)
		{
			
			Cursor c=udb.rawQuery("select * from tab_1 where u_id="+id+"", null);
			Toast.makeText(getApplicationContext(),"select * from tab_1 where u_id="+id+"", Toast.LENGTH_LONG).show();
			while(c.moveToNext())
			{
			uet1.setText(c.getString(1));
			uet2.setText(c.getString(2));
			uet3.setText(c.getString(0));
		}
		}
		
		if(v==ub)
		{
			Toast.makeText(getApplicationContext(),"update tab_1 set name='"+uet1.getText().toString()+"' and pwd='"+uet2.getText().toString()+"' where u_id="+id+"", Toast.LENGTH_LONG).show();
			//udb.execSQL("update tab_1 set name='"+uet1.getText().toString()+"', pwd='"+uet2.getText().toString()+"' where u_id="+id+"");
			ContentValues cv=new ContentValues();
			cv.put("u_id", Integer.parseInt(uet3.getText().toString()));
			cv.put("name", uet1.getText().toString());
			cv.put("pwd", uet2.getText().toString());
			String idd=String.valueOf(id);
			String whereClause="u_id=?";
			String whereArgs[]={idd};
			udb.update("tab_1", cv, whereClause, whereArgs);
			
		}
	}
}
