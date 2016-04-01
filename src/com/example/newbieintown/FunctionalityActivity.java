package com.example.newbieintown;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class FunctionalityActivity  extends Activity implements OnClickListener{

	private Button single;
	private Button married;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.functionality);
        
        single = (Button)findViewById(R.id.single);
    	single.setOnClickListener(this);
        
    	married = (Button)findViewById(R.id.married);
    	married.setOnClickListener(this);
    	
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
		
		if(v==single){
			Intent explicitIntent = new Intent(FunctionalityActivity.this,SingleActivity.class);
    		startActivity(explicitIntent);
			//Toast.makeText(this,"Register",Toast.LENGTH_LONG).show();
		}
		
       if(v==married){
    	   Intent explicitIntent = new Intent(FunctionalityActivity.this,MarriedActivity.class);
   		   startActivity(explicitIntent);
    	   //Toast.makeText(this,"Functionality",Toast.LENGTH_LONG).show();
		}
	}
    
}
