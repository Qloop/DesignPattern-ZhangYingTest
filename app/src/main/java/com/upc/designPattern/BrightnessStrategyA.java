package com.upc.designPattern;

import com.upc.designPattern.impl.BrightnessStrategy;

/**
 * 亮度调节策略A
 * Created by Explorer on 2016/5/6.
 */
public class BrightnessStrategyA extends BrightnessStrategy {

	@Override
	public void excute(int progress) {
		//执行亮度调节的操作 这里只做打印 可扩展为真实的操作
		System.out.println("亮度调节策略---A");
	}
}
