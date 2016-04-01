package com.example.newbieintown;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.telephony.gsm.SmsManager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class SMSActivity extends Activity {
    /** Called when the activity is first created. */
	EditText smsText;
	PendingIntent sendIntent;
	PendingIntent receiveIntent;
	
	String sent= "MESSAGE_SENT";
	String received ="MESSAGE_DELIVERED";
	
	BroadcastReceiver sendBR;
	BroadcastReceiver receiveBR;
			
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sms);
        sendIntent = PendingIntent.getBroadcast(this, 0,new Intent(sent), 0);
        receiveIntent = PendingIntent.getBroadcast(this, 0, new Intent(received), 0);
        smsText = (EditText)findViewById(R.id.message_text);
        Button sendButton = (Button)findViewById(R.id.send_button);
        sendButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
			String message = smsText.getText().toString();
				SmsManager sms = SmsManager.getDefault();
				sms.sendTextMessage("8960565195", null, message, sendIntent, receiveIntent);
			}
			
			
		});
    
    registerReceiver(new BroadcastReceiver() {
		
		@Override
		public void onReceive(Context context, Intent intent) {
            switch(getResultCode()){
            case Activity.RESULT_OK: smsText.append("..sent");
            break;
            default:
            		smsText.append("..not sent");
            		break;
            }
			
		}
	}, new IntentFilter(sent));
    
registerReceiver(new BroadcastReceiver() {
		
		@Override
		public void onReceive(Context context, Intent intent) {
            switch(getResultCode()){
            case Activity.RESULT_OK: smsText.append("..received");
            break;
            default:
            		smsText.append("..not received");
            		break;
            }
			
		}
    
}, new IntentFilter(received));
    }
    
    @Override
    protected void onStop() {
    	// TODO Auto-generated method stub
    	super.onStop();
    	unregisterReceiver(sendBR);
    	unregisterReceiver(receiveBR);
    }
}