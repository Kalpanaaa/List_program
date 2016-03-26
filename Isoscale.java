package com.aop;

public class Isoscale {

	boolean getCheck(Triangle t) {
		if (t.getSide1() == t.getSide2() && t.getSide2() == t.getSide3()) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Triangle triangle = new Triangle();
		Isoscale isoscale = new Isoscale();
		isoscale.getCheck(triangle);
	}

}
