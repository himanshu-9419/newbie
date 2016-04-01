package com.example.newbieintown;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SecondActivity extends Activity implements OnClickListener {

	private Button essential;
	private Button nextstep;
	private Button misc;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        
        essential = (Button)findViewById(R.id.essential);
    	essential.setOnClickListener(this);
    	
    	nextstep=(Button)findViewById(R.id.nextstep);
    	nextstep.setOnClickListener(this);
    	

    	misc=(Button)findViewById(R.id.misc);
    	misc.setOnClickListener(this);
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
		
		
		if(v==essential){
			Intent explicitIntent = new Intent(SecondActivity.this,EssentailActivity.class);
    		startActivity(explicitIntent);
		}
		
       if(v==nextstep){
    	   Intent explicitIntent = new Intent(SecondActivity.this,NextStepActivity.class);
   		startActivity(explicitIntent);
		}
       
       if(v==misc){
    	   Intent explicitIntent = new Intent(SecondActivity.this,MiscActivity.class);
   		   startActivity(explicitIntent);
		}
	}
    
}
