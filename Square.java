package com.aop;

class Square {

	boolean getCheck(Rectangle rectangle) {
		double height = rectangle.getHeight();
		double width = rectangle.getWidth();
		if (height == width) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		Square square = new Square();
		square.getCheck(rectangle);

	}

}
