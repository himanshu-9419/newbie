package com.example.newbieintown;


import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class NextStepActivity extends Activity implements OnClickListener{

	private Button register;
	private Button functionality;
	private Button callus;
	private Button tellafriend;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nextstep);
        
        register = (Button)findViewById(R.id.register);
    	register.setOnClickListener(this);
    	
    	functionality=(Button)findViewById(R.id.functionality);
    	functionality.setOnClickListener(this);
    	
    	callus=(Button)findViewById(R.id.callus);
    	callus.setOnClickListener(this);
    	
    	tellafriend=(Button)findViewById(R.id.tellafriend);
    	tellafriend.setOnClickListener(this);
    	
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    
    

	public boolean onOptionsItemSelected(MenuItem item){
		switch(item.getItemId()){
			case R.id.adminloginmenu:
			Intent l=new Intent(NextStepActivity.this,DataListView.class);
			startActivity(l);
			//Toast.makeText(this, "Admin login menu ", Toast.LENGTH_SHORT).show();
			return true;
		default:
			return super.onOptionsItemSelected(item);
			
		}
	}


	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		if(v==register){
			Intent explicitIntent = new Intent(NextStepActivity.this,RegisterActivity.class);
    		startActivity(explicitIntent);
			//Toast.makeText(this,"Register",Toast.LENGTH_LONG).show();
		}
		
       if(v==functionality){
    	   Intent explicitIntent = new Intent(NextStepActivity.this,FunctionalityActivity.class);
   		   startActivity(explicitIntent);
    	   //Toast.makeText(this,"Functionality",Toast.LENGTH_LONG).show();
		}


		if(v==callus){
			//Intent explicitIntent = new Intent(SecondActivity.this,EssentailActivity.class);
   		    //startActivity(explicitIntent);
			//Toast.makeText(this,"Call us",Toast.LENGTH_LONG).show();
			Intent intent = new Intent(Intent.ACTION_DIAL);
	        // intent.setData(Uri.parse("tel:9832322638"));
	       intent.setData(Uri.parse("content://contacts/people/13"));
	        startActivity(intent);
		}
		
      if(v==tellafriend){
   	   Intent explicitIntent = new Intent(NextStepActivity.this,SMSActivity.class);
  		startActivity(explicitIntent);
   		//Toast.makeText(this,"Tell a friend",Toast.LENGTH_LONG).show();
		}

       
       
       
	}
    
}
