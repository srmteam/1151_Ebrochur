 package com.example.srmbrochure;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.support.v4.app.NavUtils;
import android.annotation.TargetApi;
import android.os.Build;
import android.content.Intent;
public class AboutUs extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_about_us);
		// Show the Up button in the action bar.
		setupActionBar();
		Button home=(Button) findViewById(R.id.Home1);
		home.setOnClickListener(new View.OnClickListener(){
			public void onClick(View view){
				Intent myintent= new Intent(view.getContext(), MainActivitySrm.class);
				startActivityForResult(myintent,0);
			
			}
		});
		Button acc=(Button) findViewById(R.id.campus);
		acc.setOnClickListener(new View.OnClickListener(){
			public void onClick(View view){
				Intent myintent= new Intent(view.getContext(), Campus.class);
				startActivityForResult(myintent,0);
			
			}
		});
		Button acc1=(Button) findViewById(R.id.accommodation);
		acc1.setOnClickListener(new View.OnClickListener(){
			public void onClick(View view){
				Intent myintent= new Intent(view.getContext(), Accommodation.class);
				startActivityForResult(myintent,0);
			
			}
		});
		Button form=(Button) findViewById(R.id.Form);
		form.setOnClickListener(new View.OnClickListener(){
			public void onClick(View view){
				Intent myintent= new Intent(view.getContext(), Form.class);
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
		getMenuInflater().inflate(R.menu.about_us, menu);
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
