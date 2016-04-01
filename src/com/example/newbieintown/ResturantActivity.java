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


public class  ResturantActivity extends Activity implements OnClickListener{

	private Button link1;
	private Button submitrestu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resturant);
        
        link1 = (Button)findViewById(R.id.link3);
        link1.setOnClickListener(this);
        
    	submitrestu = (Button)findViewById(R.id.submitrestu);
    	submitrestu.setOnClickListener(this);
    	
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
            myWebLink.setData(Uri.parse("https://www.zomato.com/india"));
            startActivity(myWebLink);
		}
		
       if(v==submitrestu){
    	   String s="https://www.google.co.in/webhp?hl=en#hl=en&q=restaurant+";
    	   EditText d=(EditText) findViewById(R.id.enterlocation1);
    	   s=s+d.getText().toString();
    	   
    	   Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
           myWebLink.setData(Uri.parse(s));
           startActivity(myWebLink);
    	   
		}
	}
    
}
