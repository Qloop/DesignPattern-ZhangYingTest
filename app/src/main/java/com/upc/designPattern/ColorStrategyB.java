package com.upc.designPattern;

import com.upc.designPattern.impl.ColorStrategy;

/**
 * 颜色调节策略B
 * Created by Explorer on 2016/5/6.
 */
public class ColorStrategyB extends ColorStrategy {

	@Override
	public void excute(int progress) {
		//执行颜色调节的操作 这里只做打印 可扩展为真实的操作
		System.out.println("颜色调节策略---B");
	}
}
