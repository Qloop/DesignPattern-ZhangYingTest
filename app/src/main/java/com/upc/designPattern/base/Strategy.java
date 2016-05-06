package com.upc.designPattern.base;

/**
 * 调节策略抽象类
 * Created by Explorer on 2016/5/6.
 */
public abstract class Strategy {

	/**
	 * 具体怎么调节由子类实现
	 * @param progress  滑动条进度值
	 */
	public abstract void excute(int progress);
}
