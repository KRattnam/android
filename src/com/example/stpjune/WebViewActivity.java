package com.example.stpjune;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WebViewActivity extends Activity implements OnClickListener {
	
	TextView tv9;
	Button b9;
	WebView wv1;
	EditText edt;
	String str;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_web_view);
		
		tv9=(TextView)findViewById(R.id.tv9);
		b9=(Button)findViewById(R.id.b9);
		b9.setOnClickListener(this);
		wv1=(WebView)findViewById(R.id.wv1);
		edt=(EditText)findViewById(R.id.edt);
		
		
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v==b9)
		{
			str=edt.getText().toString();
			
			wv1.getSettings().setJavaScriptEnabled(true);
			wv1.loadUrl("http://"+str);
		}
	}
}
