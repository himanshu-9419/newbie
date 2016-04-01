package com.example.newbieintown;



import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SingleActivity extends Activity implements OnClickListener{

	private Button houseonrent;
	private Button bill;
	private Button healthcheckup;
	private Button gym;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.single);
        
        houseonrent=(Button)findViewById(R.id.houseonrent2);
    	houseonrent.setOnClickListener(this);
    	
    	bill=(Button)findViewById(R.id.bill2);
    	bill.setOnClickListener(this);
    	
    	healthcheckup=(Button)findViewById(R.id.healthcheckup2);
    	healthcheckup.setOnClickListener(this);
    	

    	gym=(Button)findViewById(R.id.gym2);
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
	
		
       if(v==houseonrent){
    	   Intent explicitIntent = new Intent(SingleActivity.this,HouseOnRentAcitivity.class);
   		   startActivity(explicitIntent);
		}


		if(v==bill){
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
