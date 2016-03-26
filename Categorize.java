package com.aop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Categorize {
	void cate(String s) {
		Map<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			if(map.get(ch)==null){
				ArrayList<String> arrayList = new ArrayList<String>();
				map.put(ch, arrayList);
				
			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
