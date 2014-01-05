package com.example.srmbrochure;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.support.v4.app.NavUtils;
import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;

public class Campus extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_campus);
		// Show the Up button in the action bar.
		setupActionBar();
		Button home=(Button) findViewById(R.id.Campus);
		home.setOnClickListener(new View.OnClickListener(){
			public void onClick(View view){
				Intent myintent= new Intent(view.getContext(), MainActivitySrm.class);
				startActivityForResult(myintent,0);
			
			}
		});
		Button campp1=(Button) findViewById(R.id.camp1);
		campp1.setOnClickListener(new View.OnClickListener(){
			public void onClick(View view){
				Intent myintent= new Intent(view.getContext(), Camp1.class);
				startActivityForResult(myintent,0);
			
			}
		});
		Button campp2=(Button) findViewById(R.id.camp2);
		campp2.setOnClickListener(new View.OnClickListener(){
			public void onClick(View view){
				Intent myintent= new Intent(view.getContext(), Camp2.class);
				startActivityForResult(myintent,0);
			
			}
		});
		Button campp3=(Button) findViewById(R.id.camp3);
		campp3.setOnClickListener(new View.OnClickListener(){
			public void onClick(View view){
				Intent myintent= new Intent(view.getContext(), Camp3.class);
				startActivityForResult(myintent,0);
			
			}
		});
		Button campp4=(Button) findViewById(R.id.camp4);
		campp4.setOnClickListener(new View.OnClickListener(){
			public void onClick(View view){
				Intent myintent= new Intent(view.getContext(), Camp4.class);
				startActivityForResult(myintent,0);
			
			}
		});
	}

	/**
	 * Set up the {@link android.app.ActionBar}, if the API is available.
	 */
	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	private void setupActionBar() {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
			getActionBar().setDisplayHomeAsUpEnabled(true);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.campus, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			// This ID represents the Home or Up button. In the case of this
			// activity, the Up button is shown. Use NavUtils to allow users
			// to navigate up one level in the application structure. For
			// more details, see the Navigation pattern on Android Design:
			//
			// http://developer.android.com/design/patterns/navigation.html#up-vs-back
			//
			NavUtils.navigateUpFromSameTask(this);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

}
