package com.example.newbieintown;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.View.OnTouchListener;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        

         Button  b= (Button)findViewById(R.id.tx);
        b.setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View arg0, MotionEvent event) {
				// TODO Auto-generated method stub
				
				int action=event.getAction();
                switch(action){
				
				case MotionEvent.ACTION_DOWN :
					
					break;
					
				case MotionEvent.ACTION_MOVE:
					
				   
					break;
					
				case MotionEvent.ACTION_UP:
				{
					Intent explicitIntent = new Intent(MainActivity.this,SecondActivity.class);
	        		startActivity(explicitIntent);
					break;
				}
				}
				
				return false;
			}
		});
        
        
        
        
        
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
