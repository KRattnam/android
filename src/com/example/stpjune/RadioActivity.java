package com.example.stpjune;

import android.R.color;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class RadioActivity extends Activity implements OnClickListener{

	RadioButton rb;
	RadioGroup rgp;
	Button b;
	RelativeLayout rel_lyt;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_radio);
		rel_lyt=(RelativeLayout)findViewById(R.id.rel_lyt);
		
		rb=(RadioButton)findViewById(R.id.radioButton1);
		rb.setOnClickListener(this);
		
		b=(Button)findViewById(R.id.button1);
		b.setOnClickListener(this);
		
		rgp=(RadioGroup)findViewById(R.id.rgp);
		//Toast.makeText(getApplicationContext(), "", duration)
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v==b)
			
		{
			rel_lyt.setBackgroundColor(Color.MAGENTA);
			if(rb.isChecked())
			{
				rel_lyt.setBackgroundColor(Color.RED);
				Toast.makeText(getApplicationContext(),"RadioButtonChecked", Toast.LENGTH_LONG).show();
			}
			
			
			int id1=rgp.getCheckedRadioButtonId();
			RadioButton rbtn=(RadioButton)findViewById(id1);
			String val=rbtn.getText().toString();

			if(val.equalsIgnoreCase("Red"))
				rel_lyt.setBackgroundColor(Color.RED);
			if(val.equalsIgnoreCase("Green"))
				rel_lyt.setBackgroundColor(Color.GREEN);
			if(val.equalsIgnoreCase("Blue"))
				rel_lyt.setBackgroundColor(Color.BLUE);
				
			Toast.makeText(getApplicationContext(),val, Toast.LENGTH_LONG).show();
		}
			
		}
		
		}
		
