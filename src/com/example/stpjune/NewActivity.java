package com.example.stpjune;

import android.app.Activity;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class NewActivity extends Activity implements OnClickListener {
	
	Button navBtn,callBtn,msgBtn,serBtn,mapBtn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_new);
		
		navBtn=(Button)findViewById(R.id.navbtn);
		navBtn.setOnClickListener(this);	
		callBtn=(Button)findViewById(R.id.callBtn);
		callBtn.setOnClickListener(this);
		msgBtn=(Button)findViewById(R.id.msgBtn);
		msgBtn.setOnClickListener(this);
		serBtn=(Button)findViewById(R.id.webSearch);
		serBtn.setOnClickListener(this);
		mapBtn=(Button)findViewById(R.id.mapBtn);
		mapBtn.setOnClickListener(this);	
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v==navBtn)
		{
			Intent i=new Intent(NewActivity.this,MainActivity.class);
			i.putExtra("Name", "Sachin");
			startActivity(i);
			
		}
		
		if(v==callBtn)
		{
			Intent i=new Intent(Intent.ACTION_CALL,Uri.parse("tel:9835563582"));
			startActivity(i);
		}
		
		if(v==msgBtn)
		{
			Intent i=new Intent(Intent.ACTION_SENDTO,Uri.parse("sms:9835563582"));
			i.putExtra("sms_body","Hi...catch you later");
			startActivity(i);
		}
		if(v==serBtn)
		{
			Intent i=new Intent(Intent.ACTION_SEARCH);
			i.putExtra(SearchManager.QUERY,"Android");
			startActivity(i);
			
		}
		if(v==mapBtn)
		{
			String loc="Mumbai";
			Intent i=new Intent(Intent.ACTION_VIEW,Uri.parse("geo:"+loc));
			startActivity(i);
		}
		}
		}

