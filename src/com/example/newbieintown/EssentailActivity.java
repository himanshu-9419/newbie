package com.example.newbieintown;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class EssentailActivity extends Activity implements OnClickListener{

	private Button taxi;
	private Button findhotel;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.essential);
        taxi = (Button)findViewById(R.id.taxi);
    	taxi.setOnClickListener(this);
    	
    	findhotel=(Button)findViewById(R.id.findhotel);
    	findhotel.setOnClickListener(this);
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
		if(v==taxi){
			Intent explicitIntent = new Intent(EssentailActivity.this,TaxiListActivity.class);
    		startActivity(explicitIntent);
			//Toast.makeText(this,"Direct to OLA",Toast.LENGTH_LONG).show();
		}
		
       if(v==findhotel){
    	   Intent explicitIntent = new Intent(EssentailActivity.this,HotelListActivity.class);
   		   startActivity(explicitIntent);
    		//Toast.makeText(this,"Google Map api",Toast.LENGTH_LONG).show();
		}
	}
    
}
