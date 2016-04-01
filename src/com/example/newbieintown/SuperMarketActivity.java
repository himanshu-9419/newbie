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


public class  SuperMarketActivity extends Activity implements OnClickListener{

	private Button link1;
	private Button submitsuper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.supermarket);
        
        link1 = (Button)findViewById(R.id.link1);
    	link1.setOnClickListener(this);
        
    	submitsuper = (Button)findViewById(R.id.submitsuper);
    	submitsuper.setOnClickListener(this);
    	
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
		
		if(v==link1){
			Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
            myWebLink.setData(Uri.parse("https://www.grofers.com/"));
            startActivity(myWebLink);
		}
		
       if(v==submitsuper){
    	   String s="https://www.google.co.in/?gfe_rd=cr&ei=rmHtVo7EGaXT8ger5K9I#q=supermarket+";
    	   EditText d=(EditText) findViewById(R.id.enterlocation);
    	   s=s+d.getText().toString();
    	   
    	   Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
           myWebLink.setData(Uri.parse(s));
           startActivity(myWebLink);
    	   
		}
	}
    
}
