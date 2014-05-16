package com.time.tomato.tools;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;

public class BaseTools {
	/**
	 * ��ȡ��Ļ���
	 */
	public static int getWindowWidth(Activity activity) {
		DisplayMetrics metrics = new DisplayMetrics();
		activity.getWindowManager().getDefaultDisplay().getMetrics(metrics);
		return metrics.widthPixels;
	}
}
