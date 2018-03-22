package com.example.stpjune;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class DeleteRecord extends Activity implements OnClickListener{

	Button db;
	EditText det;
	TextView dtv;
	SQLiteDatabase ddb;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_delete_record);
		db=(Button)findViewById(R.id.db);
		db.setOnClickListener(this);
		det=(EditText)findViewById(R.id.det);
		dtv=(TextView)findViewById(R.id.dtv);
		
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		int id=Integer.parseInt(det.getText().toString());
		ddb=openOrCreateDatabase("DemoDb", MODE_PRIVATE,null);
		if(v==db)
		{
			Toast.makeText(getApplicationContext(), "delete from tab_1 where u_id="+id+"", 500).show();
			//ddb.execSQL("delete from tab_1 where u_id="+id+"");
			String idd=String.valueOf(id);
			String whereClause="u_id=?";
			String whereArgs[]={idd};
			ddb.delete("tab_1", whereClause, whereArgs);
			
			Intent i=new Intent(DeleteRecord.this,ViewAllRecords.class);
			startActivity(i);
		}
		
	}
}
