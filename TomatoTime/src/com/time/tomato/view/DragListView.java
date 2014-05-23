package com.time.tomato.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/**
 * ������ק��ListView
 */
public class DragListView extends ListView {
	/** �϶���position */
	public int dragPosition;
	/** �·���position */
	public int dropPosition;
	/** downX */
	public int downX;
	/** downY */
	public int downY;
	/** ���ʱ����ĻX����  */
	public int windowX;
	/** ���ʱ����ĻY���� */
	public int windowY;
	public DragListView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	@Override
	public boolean onInterceptTouchEvent(MotionEvent ev) {
		// TODO Auto-generated method stub
		if(ev.getAction() == MotionEvent.ACTION_DOWN){
			downX = (int) ev.getX();
			downY = (int) ev.getY();
			windowX = (int) ev.getX();
			windowY = (int) ev.getY();
			setOnItemLongClick(ev);
		}
		return super.onInterceptTouchEvent(ev);
	}

	/**
	 * �����¼����� 
	 */
	public void setOnItemLongClick(final MotionEvent ev){
		setOnItemLongClickListener(new OnItemLongClickListener() {

			@Override
			public boolean onItemLongClick(AdapterView<?> parent, View view,
					int position, long id) {
				int x = (int) ev.getX();
				int y = (int) ev.getY();
				dragPosition = position;
				
				return false;
			}
		});
	}
	/**
	 * ���϶�ʱ
	 */
	public void onDrag() {

	}
}
