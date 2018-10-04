package com.thiru.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import android.widget.Toast;

public class MainActivity extends BroadcastReceiver
{

	@Override
	public void onReceive(Context context, Intent intent) {
		// TODO Auto-generated method stub
		String state=intent.getStringExtra(TelephonyManager.EXTRA_STATE);
		if (state.equals(TelephonyManager.EXTRA_STATE_RINGING)) {
			Toast.makeText(context, "ringing", Toast.LENGTH_SHORT).show();
		}
		else if (state.equals(TelephonyManager.EXTRA_STATE_OFFHOOK)) {
			Toast.makeText(context, "received", Toast.LENGTH_SHORT).show();
		}
		else if (state.equals(TelephonyManager.EXTRA_STATE_IDLE)) {
			Toast.makeText(context, "Ended", Toast.LENGTH_SHORT).show();
		}
	}
	
}