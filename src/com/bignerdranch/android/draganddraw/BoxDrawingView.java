package com.bignerdranch.android.draganddraw;

import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

public class BoxDrawingView extends View {
	private static final String TAG = "BoxDrawingView";
	
	// Used when creating the view in code
	public BoxDrawingView(Context context) {
		this(context, null);
	}

	// Used when inflating the view from XML
	public BoxDrawingView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		PointF curr = new PointF(event.getX(), event.getY());
		
		Log.i(TAG, "Received event at x=" + curr.x + 
				", y=" + curr.y + ":");
		switch(event.getAction()) {
		case MotionEvent.ACTION_DOWN:
			Log.i(TAG, " ACTION_DOWN");
			break;
		case MotionEvent.ACTION_MOVE:
			Log.i(TAG, " ACTION_MOVE");
			break;
		case MotionEvent.ACTION_UP:
			Log.i(TAG, " ACTION_UP");
			break;
		case MotionEvent.ACTION_CANCEL:
			Log.i(TAG, " ACTION_CANCEL");
		}
		
		return true;
	}

}
