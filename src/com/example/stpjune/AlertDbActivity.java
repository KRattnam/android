package com.example.stpjune;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class AlertDbActivity extends Activity implements OnClickListener{

	Button alrtBtn;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_alert_db);
		alrtBtn=(Button)findViewById(R.id.alrtBtn);
		alrtBtn.setOnClickListener(this);
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v==alrtBtn)
		{
			AlertDialog.Builder builder=new AlertDialog.Builder(this);
			builder.setMessage("Do you want to exit?");
			builder.setTitle("AlertBox");
			builder.setIcon(android.R.drawable.ic_dialog_alert);
			builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int which) {
					// TODO Auto-generated method stub
					Toast.makeText(getApplicationContext(), "Yes", 100).show();
					finish();
				}
			});
			builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int which) {
					// TODO Auto-generated method stub
					Toast.makeText(getApplicationContext(), "No", 100).show();
				}
			});
			builder.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int which) {
					// TODO Auto-generated method stub
					Toast.makeText(getApplicationContext(), "Cancel", 100).show();
				}
			});
			AlertDialog alert=builder.create();
			alert.show();
		}
		
	}
	
	
}
