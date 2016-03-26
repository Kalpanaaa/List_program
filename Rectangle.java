package com.aop;

public class Rectangle {

	double height;
	double width;

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	Rectangle(){
		setHeight(20);
		setWidth(30);
		
	}
}
