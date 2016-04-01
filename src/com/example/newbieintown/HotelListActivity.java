package com.example.newbieintown;

import android.app.ListActivity;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class HotelListActivity extends ListActivity {
    /** Called when the activity is first created. */
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.main);
        String[] c = getResources().getStringArray(R.array.hotel);
        setListAdapter(new ArrayAdapter<String>(this, R.layout.list_item,c));
        
        ListView v = getListView();
        
        v.setOnItemClickListener(new OnItemClickListener() {
		
		@Override
		public void onItemClick(AdapterView<?> parent, View view, int position,long rowId) {
			//String s = view.getT
			String s = ((TextView)view).getText().toString();// +" "+ position + " " + rowId;
			Toast.makeText(getApplicationContext(), s, Toast.LENGTH_SHORT).show();
		//	char c = (char)1004;
			//CharSequence cs= " "+ c+ " ";
			
			if(s.equals("OYO")){
				Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                myWebLink.setData(Uri.parse("https://www.oyorooms.com/"));
                startActivity(myWebLink);
								
			}
			else if(s.equals("HOTELS.COM")){
				Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                myWebLink.setData(Uri.parse("https://in.hotels.com/"));
                startActivity(myWebLink);	
			}
            else if(s.equals("ORBITZ")){
            	Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                myWebLink.setData(Uri.parse("https://www.orbitz.com/"));
                startActivity(myWebLink);
			}
            else if(s.equals("HOTEL TONIGHT")){
            	Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                myWebLink.setData(Uri.parse("https://www.hoteltonight.com/"));
                startActivity(myWebLink);
			}
			
			
		}
        });
    }
}