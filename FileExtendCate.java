package com.aop;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FileExtendCate {
	Map<String, ArrayList<String>> categorizeExtend(File dir) {
		File[] files = dir.listFiles();
		Map<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
		for (File file : files) {
			String pathName = file.getName();
			int dot = pathName.lastIndexOf(".");
			String path = pathName.substring(dot + 1);
			if (map.get(path) == null) {
				ArrayList<String> files1 = new ArrayList<String>();
				map.put(path, files1);
				files1.add(path);
			} else {
				ArrayList<String> list = map.get(path);
				list.add(path);
			}
		}
		return map;

	}

	public static void main(String[] args) {
		FileExtendCate fileCate = new FileExtendCate();
		File a = new File("/home/kalpana/Documents");
		System.out.println(fileCate.categorizeExtend(a));
	}

}
