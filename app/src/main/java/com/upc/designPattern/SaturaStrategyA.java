package com.upc.designPattern;

import com.upc.designPattern.impl.SaturaStrategy;

/**
 * 饱和度调节策略A
 * Created by Explorer on 2016/5/6.
 */
public class SaturaStrategyA extends SaturaStrategy {

	@Override
	public void excute(int progress) {
		//执行饱和度调节的操作 这里只做打印 可扩展为真实的操作
		System.out.println("饱和度调节策略---A");
	}
}
