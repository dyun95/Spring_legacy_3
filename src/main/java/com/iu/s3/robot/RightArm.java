package com.iu.s3.robot;

public class RightArm {
	
	private int power;
	private String color;
	
	
	public RightArm(int power, String color) {
		this.power = power;
		this.color = color;
	}

	public int getPower() {
		return power;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setPower(int power) {
		this.power = power;
	}
	
	

}
