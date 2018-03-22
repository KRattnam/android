package com.example.stpjune;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ProgressBar;
import android.widget.TextView;

public class ProgressActivity extends Activity {

	ProgressBar pb;
	TextView tv8;
	int progressStatus=0;
	Handler handler=new Handler();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_progress);
		
		pb=(ProgressBar)findViewById(R.id.pb1);
		tv8=(TextView)findViewById(R.id.tv8);
		
		new Thread(new Runnable() {
			public void run() {
				while (progressStatus < 100) {
					progressStatus += 1;
					// Update the progress bar and display the current value in the text view
					handler.post(new Runnable() {
						public void run() {
							pb.setProgress(progressStatus);
							tv8.setText(progressStatus+"/"+pb.getMax());
						}
					});
					try {
						// Sleep for 200 milliseconds. Just to display the progress slowly
						Thread.sleep(200);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
	}
}

