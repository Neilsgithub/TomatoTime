package com.time.tomato.tools;

import java.util.ArrayList;

import com.time.tomato.entity.TomatoEntity;

/**
 * ������
 */
public class Constants {
	// SharedPreferences ������Ϣ�д�ŵ�Ԫ�� 
	public final static String FINISHTIME = "finishtime";
	public final static String WORKTIME = "worktime";
	public final static String RESTTIEM = "resttime";
	
	
	/** ���������Ӧ��ACTION */
	public final static String INTENT_AUTOSERVICE = "com.intent.service.autoservice";
	
	/**
	 * ��ȡToast�б�
	 */
	public static ArrayList<TomatoEntity> getToastList(){
		ArrayList<TomatoEntity> list = new ArrayList<TomatoEntity>();
		for(int i = 0; i < 5 ; i++){
			TomatoEntity toast = new TomatoEntity();
			toast.setId(i + 1);
			toast.setContent("����" + i);
			toast.setIsFinished(0L);
			toast.setIsTop(0L);
			toast.setIsImportant(0L);
			list.add(toast);
		}
		return list;
	}
	
	/** wheel���ֵ�����,�·�չʾ */
	public final static String[] array_mouth = new String[]{"һ��" , "����", "����", "һ��", "һ��", "һ��", "һ��", "һ��", "һ��", "һ��"}; 
	
	/** wheel���ֵ�����,ʱ�� */
	public final static String[] array_time = new String[]{"00" , "05", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55"}; 
	
	
}
