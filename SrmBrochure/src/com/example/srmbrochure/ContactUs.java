package com.example.srmbrochure;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;

public class ContactUs extends Activity implements OnCheckedChangeListener  {

	RadioGroup rg;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_contact_us);
		// Show the Up button in the action bar.
		setupActionBar();
		Button home=(Button) findViewById(R.id.Home1);
		home.setOnClickListener(new View.OnClickListener(){
			public void onClick(View view){
				Intent myintent= new Intent(view.getContext(), MainActivitySrm.class);
				startActivityForResult(myintent,0);
			
			}
		});
		TextView textView= (TextView)findViewById(R.id.textView);
		textView.setClickable(true);
		textView.setMovementMethod(LinkMovementMethod.getInstance());
		String text = "<a href='http://www.srmuniv.ac.in'>SRM universtiy</a>";
		textView.setText(Html.fromHtml(text));
		
		rg=(RadioGroup)findViewById(R.id.rg);
		rg.setOnCheckedChangeListener(this);
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
		getMenuInflater().inflate(R.menu.contact_us, menu);
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


	@Override
	public void onCheckedChanged(RadioGroup arg0, int arg1) {
		// TODO Auto-generated method stub
		switch(arg1)
		{ case R.id.r1:
			TextView t1=(TextView)findViewById(R.id.textyo);
			t1.setText("The Director(campus life), \n Prof. R. Venkataramani \n SRM hostels, \n SRM university. \n Tele-fax - 044 - 27453159, No:044 - 27455735,36,37,38. \n E.Mail - srm.hostels@ktr.srmuniv.ac.in \n \n Manager (Admin) \n P.M.Subramaniam \n Phone: 044 – 27453159 \n E.Mail - srm.hostels@ktr.srmuniv.ac.in");
			break;
		case R.id.r2:
			TextView t2=(TextView)findViewById(R.id.textyo);
			t2.setText("Vice Principal \n Address: Bharathi Salai, Ramapuram, \n Chennai - 600 089. \n Phone: +91-44-30603042, 30603072 \n Fax: +91-44-30603092 \n E-Mail: vp@rmp.srmuniv.ac.in");
			break;
		case R.id.r3:TextView t3=(TextView)findViewById(R.id.textyo);
		t3.setText("Director \n No.1, Jawaharlal Nehru Road, \n (100 feet Road, \n Near Vadapalani Signal), \n Vadapalani, \n Chennai - 600 026 \n Phone: +91-44-43969966, 43969956 \n E-Mail: director@vdp.srmuniv.ac.in");
			break;
		case R.id.r4:TextView t4=(TextView)findViewById(R.id.textyo);
		t4.setText("Administrative Officer \n G-38, Lajpat Nagar - III, \n New Delhi – 110024 \n Phone: +91-1232-234301, 1232-234304 \n Fax: +91-1232-234308, +91-1232-234309 \n Email: ao@ncr.srmuniv.ac.in / ao@srmimt.net \n \n Director \n SRM University (NCR Campus) \n Delhi- Meerut \n Road, Modinagar \n Ghaziabad, UP – 201204 \n Phone No.: 01232- 234316, 234337 \n Fax: 01232-234308 \n Email: director@ncr.srmuniv.ac.in");
			break;
		
		
		}
	}

	
		// TODO Auto-generated method stub
		
	}


