package com.sanhao.job.billprocess.utils;

public class TimeUtil {
	
	public static String currentTimeSecond(){
		return new Long(System.currentTimeMillis()  / 1000).toString();
	}
	
}
