package com.upc.designPattern.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import com.upc.designPattern.BrightnessStrategyA;
import com.upc.designPattern.ColorStrategyB;
import com.upc.designPattern.R;
import com.upc.designPattern.SaturaStrategyB;
import com.upc.designPattern.base.Adjust;
import com.upc.designPattern.impl.BrightnessAdjust;
import com.upc.designPattern.impl.ColorAdjust;
import com.upc.designPattern.impl.SaturaAdjust;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Explorer on 2016/5/6.
 */
public class SettingsActivity extends Activity implements View.OnClickListener {

	private Button btnColor;
	private Button btnBrightness;
	private Button btnSaturation;
	private SeekBar mSeekBar;

	private List<Adjust> adjustList = new ArrayList<>();
	private Adjust adjust;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_settings);

		initViews();
	}

	private void initViews() {
		//初始化组件 设置tag
		btnBrightness = (Button) findViewById(R.id.btn_brightness);
		btnBrightness.setTag(0);
		btnBrightness.setOnClickListener(this);

		btnColor = (Button) findViewById(R.id.btn_color);
		btnColor.setTag(1);
		btnColor.setOnClickListener(this);

		btnSaturation = (Button) findViewById(R.id.btn_saturation);
		btnSaturation.setTag(2);
		btnSaturation.setOnClickListener(this);

		mSeekBar = (SeekBar) findViewById(R.id.sb_progress);

		//初始化各个调节状态和策略
		BrightnessAdjust brightnessAdjust = new BrightnessAdjust(new BrightnessStrategyA());
		brightnessAdjust.tvResult = (TextView) findViewById(R.id.tv_brightness_value);
		adjustList.add(brightnessAdjust);

		ColorAdjust colorAdjust = new ColorAdjust(new ColorStrategyB());
		colorAdjust.tvResult = (TextView) findViewById(R.id.tv_color_value);
		adjustList.add(colorAdjust);

		SaturaAdjust saturaAdjust = new SaturaAdjust(new SaturaStrategyB());
		saturaAdjust.tvResult = (TextView) findViewById(R.id.tv_saturation_value);
		adjustList.add(saturaAdjust);

		//默认第一个 "亮度"调节
		adjust = adjustList.get(0);

		mSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
			@Override
			public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
				adjust.setProgress(progress);
				adjust.update();
			}

			@Override
			public void onStartTrackingTouch(SeekBar seekBar) {

			}

			@Override
			public void onStopTrackingTouch(SeekBar seekBar) {

			}
		});
	}


	@Override
	public void onClick(View v) {
		adjust = adjustList.get((Integer) v.getTag());   //根据设置的tag获取调节状态
		//初始化成上一次调节的值
		mSeekBar.setProgress(adjust.getProgress());
		adjust.update();
	}
}
