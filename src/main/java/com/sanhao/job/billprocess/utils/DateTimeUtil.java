package com.sanhao.job.billprocess.utils;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

//import org.junit.Test;

public class DateTimeUtil {
	static public int getDayBegin(Date date){
		SimpleDateFormat ft = new SimpleDateFormat("yyyy.MM.dd");
		
		int time = 0;
		try {
			 time = (int)(ft.parse(ft.format(date)).getTime()/1000);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return time;
	}
	
	@SuppressWarnings("deprecation")
	public static int  getDay(String date){
		Date epoch = null;
		try {
			epoch = new java.text.SimpleDateFormat("yyyyMMdd").parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return (int) (epoch.getTime() / 1000);
	}
	
	// 获取时间 
	public static String  getTime(long time){
		@SuppressWarnings("deprecation")
		Date date = new Date(time);
		Locale local = Locale.SIMPLIFIED_CHINESE;
		SimpleDateFormat ft = new java.text.SimpleDateFormat("yyyy－MM－dd HH:mm:ss",local);
		String result = "时间未知";
		try {
			result = ft.format(date);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
	
	// 获取年
	@SuppressWarnings("deprecation")
	public  static int getYear(long timestamp){
		Calendar calendar = Calendar.getInstance();
		
		calendar.setTime(new java.util.Date(timestamp * 1000 ));
		
		return calendar.get(Calendar.YEAR);
		
	}
	
	@SuppressWarnings("deprecation")
	public static int getMonth(long timestamp){
		Calendar calendar = Calendar.getInstance();
		
		calendar.setTime(new java.util.Date(timestamp * 1000 ));
		
		return calendar.get(Calendar.MONTH);
	}
	
	@SuppressWarnings("deprecation")
	public  static int getDay(long timestamp){
		Calendar calendar = Calendar.getInstance();
		
		calendar.setTime(new java.util.Date(timestamp * 1000 ));
		
		return calendar.get(Calendar.DAY_OF_MONTH);
	}
	
	/*
	@Test
	public void test()
	{
		System.out.println(getDayBegin(new Date()));
		
	}
	*/
	
	public static void main(String[] args){
		System.out.println(getDay("20151020"));
		
		System.out.println(getYear(1423411200L));
		System.out.println(getMonth(1423411200L));
		System.out.println(getDay(1423411200L));
		
		System.out.println(getTime(System.currentTimeMillis()));
	}
}
