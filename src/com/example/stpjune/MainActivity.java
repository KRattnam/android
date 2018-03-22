package com.example.stpjune;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener{

	CheckBox chk1,chk2;
	Button b1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

	
		chk1=(CheckBox)findViewById(R.id.checkBox1);
		chk2=(CheckBox)findViewById(R.id.checkBox2);
		b1=(Button)findViewById(R.id.button1);
		b1.setOnClickListener(this);
	}

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		Toast.makeText(getApplicationContext(), "OnStart", Toast.LENGTH_LONG).show();

	}

	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		super.onRestart();
		Toast.makeText(getApplicationContext(), "OnRestart", Toast.LENGTH_LONG).show();

	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		Toast.makeText(getApplicationContext(), "OnResume", Toast.LENGTH_LONG).show();

	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		Toast.makeText(getApplicationContext(), "OnPause", Toast.LENGTH_LONG).show();

	}

	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		Toast.makeText(getApplicationContext(), "OnStop", Toast.LENGTH_LONG).show();

	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		Toast.makeText(getApplicationContext(), "OnDestroy", Toast.LENGTH_LONG).show();

	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(chk1.isChecked())
			Toast.makeText(getApplicationContext(), chk1.getText(), Toast.LENGTH_SHORT).show();
		if(chk2.isChecked())
			Toast.makeText(getApplicationContext(), chk2.getText(), Toast.LENGTH_SHORT).show();
	}
	

}
