package com.upc.designPattern.impl;

import com.upc.designPattern.base.Strategy;

/**
 * 颜色调节策略抽象类
 * Created by Explorer on 2016/5/6.
 */
public abstract class ColorStrategy extends Strategy{

	/**
	 * 具体怎么调节由子类实现
	 * @param progress  滑动条进度值
	 */
	public abstract void excute(int progress);
}
