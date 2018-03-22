package com.example.stpjune;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RatingBar;
import android.widget.RatingBar.OnRatingBarChangeListener;
import android.widget.Toast;

public class RatingActivity extends Activity implements OnRatingBarChangeListener {

	RatingBar rb;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_rating);
		rb=(RatingBar)findViewById(R.id.rb);
		rb.setOnRatingBarChangeListener(this);
		
	}

	@Override
	public void onRatingChanged(RatingBar ratingBar, float rating,
			boolean fromUser) {
		// TODO Auto-generated method stub
		Toast.makeText(getApplicationContext(), String.valueOf(rating), 100).show();
	}
}
