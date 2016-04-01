package com.example.newbieintown;




import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MiscActivity extends Activity implements OnClickListener {

	private Button supermarket;
	private Button multiplex;
	private Button restaurant;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.misc);
        
        supermarket = (Button)findViewById(R.id.supermarket);
    	supermarket.setOnClickListener(this);
    	
    	multiplex=(Button)findViewById(R.id.multiplex);
    	multiplex.setOnClickListener(this);
    	

    	restaurant=(Button)findViewById(R.id.restaurant);
    	restaurant.setOnClickListener(this);
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
		
		
		if(v==supermarket){
			Intent explicitIntent = new Intent(MiscActivity.this,SuperMarketActivity.class);
    		startActivity(explicitIntent);
		}
		
       if(v==multiplex){
    	   Intent explicitIntent = new Intent(MiscActivity.this,MultiplexActivity.class);
   		startActivity(explicitIntent);
		}
       
       if(v==restaurant){
    	   Intent explicitIntent = new Intent(MiscActivity.this,ResturantActivity.class);
   		   startActivity(explicitIntent);
		}
	}
    
}
