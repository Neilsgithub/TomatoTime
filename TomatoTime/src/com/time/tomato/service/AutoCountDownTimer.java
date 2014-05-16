package com.time.tomato.service;

import com.time.tomato.tools.TimeTools;
import com.time.tomato.tools.TomatoNotification;

import android.content.Context;
import android.os.CountDownTimer;
import android.util.Log;

public class AutoCountDownTimer extends CountDownTimer {
	public Context context;
	public final static String TAG  = "AutoCountDownTimer";
	
	public AutoCountDownTimer(Context context,long millisInFuture, long countDownInterval) {
		super(millisInFuture, countDownInterval);
		this.context = context;
	}

	/** ��ʱ��������ʱ��Ҫ�������� */
	@Override
	public void onFinish() {
		// TODO Auto-generated method stub
		TomatoNotification.notifyFinished(context);
		Log.d(TAG, "onFinish");
	}
	
	/**����ʱ��ʼʱҪ��������*/
	@Override
	public void onTick(long millisUntilFinished) {
		// TODO Auto-generated method stub
		String countdown =  TimeTools.getCountDwon(millisUntilFinished);
		TomatoNotification.notify(context, countdown, "����������");
		Log.d(TAG, countdown +"ʱ������" );
	}

}
