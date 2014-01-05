package com.example.srmbrochure;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;





public class MainActivitySrm extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_activity_srm);
		Button press=(Button) findViewById(R.id.But1);
		press.setOnClickListener(new View.OnClickListener (){
			public void onClick(View view){
				Intent intent1=new Intent(view.getContext(), AboutUs.class);
				startActivityForResult(intent1,0);
			}
			});
		
		Button press2=(Button) findViewById(R.id.But3);
		press2.setOnClickListener(new View.OnClickListener (){
			public void onClick(View view){
				Intent intent3=new Intent(view.getContext(), Admission.class);
				startActivityForResult(intent3,0);
			}
			});
		Button press3=(Button) findViewById(R.id.But4);
		press3.setOnClickListener(new View.OnClickListener (){
			public void onClick(View view){
				Intent intent5=new Intent(view.getContext(), ContactUs.class);
				startActivityForResult(intent5,0);
			}
			});
		Button press4=(Button) findViewById(R.id.But5);
		press4.setOnClickListener(new View.OnClickListener (){
			public void onClick(View view){
				Intent intent5=new Intent(view.getContext(), Acedemics.class);
				startActivityForResult(intent5,0);
			}
			});
		Button press5=(Button) findViewById(R.id.But2);
		press5.setOnClickListener(new View.OnClickListener (){
			public void onClick(View view){
				Intent intent5=new Intent(view.getContext(), Achievements.class);
				startActivityForResult(intent5,0);
			}
			});
		TextView httpstuff=(TextView)findViewById(R.id.newz);
		GetMethodEx test=new GetMethodEx();
		String returned;
		try {
			returned = test.getInternetData();
			httpstuff.setText(returned);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		
		
		getMenuInflater().inflate(R.menu.main_activity_srm, menu);
		return true;
	}




}

