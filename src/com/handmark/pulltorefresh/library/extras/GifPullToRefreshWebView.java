package com.handmark.pulltorefresh.library.extras;

import android.content.Context;
import android.util.AttributeSet;

import com.handmark.pulltorefresh.library.PullToRefreshWebView;

public class GifPullToRefreshWebView extends PullToRefreshWebView {
	
	public GifPullToRefreshWebView(Context context) {
		super(context);
	}

	public GifPullToRefreshWebView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}
	
	public GifPullToRefreshWebView(Context context, Mode mode) {
		super(context, mode);
	}
	
	public GifPullToRefreshWebView(Context context, Mode mode, AnimationStyle style) {
		super(context, mode, style);
	}
	
	@Override
	public Orientation getPullToRefreshScrollDirection() {
		return Orientation.VERTICAL_GIF;
	}

}
