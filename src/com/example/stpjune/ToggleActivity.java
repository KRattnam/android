package com.example.stpjune;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class ToggleActivity extends Activity implements OnClickListener{
	
	ToggleButton tb;
	ImageView im1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_toggle);
		
		tb=(ToggleButton)findViewById(R.id.tb);
		tb.setOnClickListener(this);
		im1=(ImageView)findViewById(R.id.im1);
		//im2=(ImageView)findViewById(R.id.im2);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if((tb.getText().toString()).equals("ON"))
		{
		Toast.makeText(getApplicationContext(), "On", 100).show();
		im1.setImageResource(R.drawable.doggy);
		}
		else
		{
			Toast.makeText(getApplicationContext(), "Off", 100).show();
			im1.setImageResource(R.drawable.duck);
			
		}
		
	}
}
