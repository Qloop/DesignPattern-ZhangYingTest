package com.upc.designPattern.impl;

import android.widget.TextView;

import com.upc.designPattern.base.Adjust;
import com.upc.designPattern.base.Strategy;

/**
 * 亮度调节
 * Created by Explorer on 2016/5/6.
 */
public class BrightnessAdjust extends Adjust {

	//界面显示组件 可扩展添加
	public TextView tvResult;


	public BrightnessAdjust(Strategy impl) {
		super(impl);
	}

	@Override
	public void update() {
		tvResult.setText(String.valueOf(progress));
		beginAdjust();
	}

	@Override
	public void beginAdjust() {
		implStrategy.excute(progress);
	}
}
