package com.aop;

import java.util.LinkedList;

public class List <T>{
	T element[];T b[];
@SuppressWarnings("unchecked")
List(){
     element=(T[])new Object[5];
     b=(T[])new Object[2];
}



	/**
	 * @param args
	 */
	public static void main(String[] args){
	
		LinkedList <String> s=new LinkedList <String>();
		s.add("wel");
		s.add("come");
		s.add("online");
		s.add("exam");
		s.add("Thank u");
		s.add("programmer");
System.out.println("LinkedList:"+s);
	}
}
