package com.time.tomato.app;

import com.time.tomato.tools.Constants;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class AppApplication extends Application {
	public final static String USERINFO = "userinfo";
	public static AppApplication mAppApplication;
	public SharedPreferences sp_userinfo;
	/** Ĭ������ʱ�� */
	public long worktime_default = 25 * 1000 * 60;
	/** Ĭ����Ϣʱ�� */
	public long resttime_default = 5 * 1000 * 60;
	
	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		mAppApplication = this;
		sp_userinfo = getSharedPreferences(USERINFO,Context.MODE_PRIVATE);
	}

	public static AppApplication getApp() {
		return mAppApplication;
	}
	
	/** 
	 * �жϷ����Ƿ����ڽ��� 
	 * true:���ڽ���   false:�����Ѿ�ֹͣ
	 *  */
	public boolean isServiceRunning(){
		return false;
	}
	
	
	/** ��������ʱ��  */
	public void setWorkTime(long custom){
		Editor editor = sp_userinfo.edit();
		editor.putLong(Constants.WORKTIME, custom);
		editor.commit();
	}
	
	/** ��ȡ����ʱ��  */
	public long getWorkTime(){
		return sp_userinfo.getLong(Constants.WORKTIME, worktime_default);
	}
	
	/** ������Ϣʱ��  */
	public void setRestTime(long custom){
		Editor editor = sp_userinfo.edit();
		editor.putLong(Constants.RESTTIEM, custom);
		editor.commit();
	}
	
	/** ��ȡ����ʱ��  */
	public long getRestTime(){
		return sp_userinfo.getLong(Constants.RESTTIEM, resttime_default);
	}
	
	/** ���÷������ʱ��  */
	public void setFinishTime(long finishtime){
		Editor editor = sp_userinfo.edit();
		editor.putLong("finishtime", finishtime);
		editor.commit();
		
	}
	
	/** ��ȡ�������ʱ��  */
	public long getFinishtTime(){
		return sp_userinfo.getLong("finishtime", 0);
	}
}
