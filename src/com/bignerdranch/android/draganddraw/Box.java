package com.bignerdranch.android.draganddraw;

import android.graphics.PointF;

public class Box {
	private PointF mOrigin;
	private PointF mCurrent;
	
	public Box(PointF origin) {
		mOrigin = origin;
	}
	
	public void setCurrent(PointF current) {
		mCurrent = current;
	}
	
	public PointF getCurrent() {
		return mCurrent;
	}
	
	public PointF getOrigin() {
		return mOrigin;
	}
}
