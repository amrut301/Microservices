package com.note.bean;

public class LimitsConfiguration {

	private Integer min;
	private Integer max;

	public LimitsConfiguration() {
	}

	public LimitsConfiguration(Integer min, Integer max) {
		super();
		this.min = min;
		this.max = max;
	}

	public Integer getMin() {
		return min;
	}

	public void setMin(Integer min) {
		this.min = min;
	}

	public Integer getMax() {
		return max;
	}

	public void setMax(Integer max) {
		this.max = max;
	}

}
