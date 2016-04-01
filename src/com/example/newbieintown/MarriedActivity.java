package com.example.newbieintown;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MarriedActivity extends Activity implements OnClickListener{

	private Button school;
	private Button houseonrent;
	private Button bill;
	private Button healthcheckup;
	private Button gym;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.married);
        
        school = (Button)findViewById(R.id.school);
    	school.setOnClickListener(this);
    	
    	houseonrent=(Button)findViewById(R.id.houseonrent);
    	houseonrent.setOnClickListener(this);
    	
    	bill=(Button)findViewById(R.id.bill);
    	bill.setOnClickListener(this);
    	
    	healthcheckup=(Button)findViewById(R.id.healthcheckup);
    	healthcheckup.setOnClickListener(this);
    	

    	gym=(Button)findViewById(R.id.gym);
    	gym.setOnClickListener(this);
    	
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		if(v==school){
			
			Toast.makeText(this,"Map School",Toast.LENGTH_LONG).show();
			 String s="https://www.google.co.in/maps/search/school+lucknow/@26.8747416,80.9348772,13z/data=!3m1!4b1";
			   //EditText d=(EditText) findViewById(R.id.enterlocation1);
			   //s=s+d.getText().toString();
			   
			   Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
		       myWebLink.setData(Uri.parse(s));
		       startActivity(myWebLink);
			
		}
		
       if(v==houseonrent){
    	   Intent explicitIntent = new Intent(MarriedActivity.this,HouseOnRentAcitivity.class);
   		   startActivity(explicitIntent);
    	   //Toast.makeText(this,"House On rent",Toast.LENGTH_LONG).show();
		}


		if(v==bill){
			//Intent explicitIntent = new Intent(SecondActivity.this,EssentailActivity.class);
   		    //startActivity(explicitIntent);
			//Toast.makeText(this,"Bill",Toast.LENGTH_LONG).show();
			
			Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
            myWebLink.setData(Uri.parse("https://www.uppclonline.com/dispatch/Portal/appmanager/uppcl/wss%3F_nfpb%3Dtrue%26_pageLabel%3Duppcl_billInfo_payBill_home%26pageID%3DPB_1010"));
            startActivity(myWebLink);	
			
				}
		
      if(v==healthcheckup){
   	 
   		Toast.makeText(this,"Map Health Checkup",Toast.LENGTH_LONG).show();
   	    String s="https://www.google.co.in/maps/search/hospital+lucknow/@26.8744526,80.9348773,13z/data=!3m1!4b1";
	   //EditText d=(EditText) findViewById(R.id.enterlocation1);
	   //s=s+d.getText().toString();
	   
	   Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
       myWebLink.setData(Uri.parse(s));
       startActivity(myWebLink);
   		
		}


      if(v==gym){
   	   //Intent explicitIntent = new Intent(NextStepActivity.this,SMSActivity.class);
  	//	startActivity(explicitIntent);
   		Toast.makeText(this,"Map Gym",Toast.LENGTH_LONG).show();
   	 String s="https://www.google.co.in/maps/search/gym+lucknow/@26.8745971,80.9348773,13z/data=!3m1!4b1";
	   //EditText d=(EditText) findViewById(R.id.enterlocation1);
	   //s=s+d.getText().toString();
	   
	   Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
     myWebLink.setData(Uri.parse(s));
     startActivity(myWebLink);
   		
		}
       
       
	}
    
}
