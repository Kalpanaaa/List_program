package com.aop.thread;

public class MyServer extends Thread {

	public void run() {
		System.out.println("hii");
	}

	public static void main(String[] args) {
		MyServer myName = new MyServer();
		myName.start();
	}

}
