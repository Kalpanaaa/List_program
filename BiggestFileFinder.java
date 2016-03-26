package com.aop;

import java.io.File;

public class BiggestFileFinder {

	 File biggestFile(File dir) {
		long temp = 0;
		File bigFile = null;
		File[] files = dir.listFiles();
		for (File file : files) {
			if (file.isFile() == true) {
				long length = file.length();
				if (temp < length) {
					temp = length;
					bigFile = file;
				}
			} else {
				File subdir = biggestFile(file);
				if (subdir != null) {
					long length1 = subdir.length();
					if (temp <= length1) {
						temp = length1;
						bigFile = subdir;
					}
				}

			}
		}
		return bigFile;
	}

	public static void main(String[] args) {

		BiggestFileFinder fm = new BiggestFileFinder();
		File big = fm.biggestFile(new File("/home/kalpana/Desktop"));
		System.out.println(big);
	}

}
