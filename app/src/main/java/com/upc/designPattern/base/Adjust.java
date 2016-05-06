package com.upc.designPattern.base;

/**
 *
 * Created by Explorer on 2016/5/6.
 */
public abstract class Adjust {
	protected int progress = 50;   //seekbar进度位置
	protected Strategy implStrategy;   //调节策略

	public Adjust(Strategy implStrategy) {
		this.implStrategy = implStrategy;
	}

	public abstract void update();  //更新seek显示状态

	public abstract void beginAdjust();  //进行调节


	public Strategy getStrategy() {
		return implStrategy;
	}

	public void setProgress(int progress) {
		this.progress = progress;
	}

	public int getProgress() {
		return progress;
	}
}
