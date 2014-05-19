package com.time.tomato.tools;

import java.util.ArrayList;

import com.time.tomato.entity.TomatoEntity;

/**
 * ������
 */
public class Constants {
	
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
			toast.setIsFinished(false);
			toast.setIsTop(false);
			toast.setIsImportant(false);
			list.add(toast);
		}
		return list;
	}
}
