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


public class HouseOnRentAcitivity  extends Activity implements OnClickListener{

	private Button landlord;
	private Button terant;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.houseonrent);
        
        landlord = (Button)findViewById(R.id.landlord);
    	landlord.setOnClickListener(this);
        
    	terant = (Button)findViewById(R.id.terant);
    	terant.setOnClickListener(this);
    	
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
		
		if(v==landlord){
			//Intent explicitIntent = new Intent(FunctionalityActivity.this,SingleActivity.class);
    		//startActivity(explicitIntent);
			Toast.makeText(this,"map House on rent",Toast.LENGTH_LONG).show();
			String s="https://www.google.co.in/maps/place/Room+Restaurant+Office+Rent+Lucknow/@26.8389907,80.9175853,17z/data=!3m1!4b1!4m2!3m1!1s0x399bfdca138da24d:0xce13b84c7e8ac631";
			  
			   Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
		       myWebLink.setData(Uri.parse(s));
		       startActivity(myWebLink);
		}
		
       if(v==terant){
    	   Toast.makeText(this,"Map Terant",Toast.LENGTH_LONG).show();
    	  
    	   String s="https://www.google.co.in/maps/place/Room+Restaurant+Office+Rent+Lucknow/@26.8389907,80.9175853,17z/data=!3m1!4b1!4m2!3m1!1s0x399bfdca138da24d:0xce13b84c7e8ac631";
		   
		   Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
	       myWebLink.setData(Uri.parse(s));
	       startActivity(myWebLink);
		}
	}
    
}
