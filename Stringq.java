package com.aop;

public class Stringq {
String a="pavan";
String b="pavan";
	public String getA() {
	return a;
}
public void setA(String a) {
	this.a = a;
}
public String getB() {
	return b;
}
public void setB(String b) {
	this.b = b;
}
	public static void main(String[] args) {
		Stringq stringq = new Stringq();
		String a=stringq.getB();
		if(stringq.getA().equals(a)){
			System.out.println("this pasiable");
		}else{
			System.out.println("not pasiable");
		}
	}

}
