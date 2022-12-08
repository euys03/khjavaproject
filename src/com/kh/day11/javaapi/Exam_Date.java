package com.kh.day11.javaapi;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Exam_Date {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		// date포맷 - SimpleDateFormat 사용
		SimpleDateFormat trans = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		SimpleDateFormat trans2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String transDate1 = trans.format(date);
		String transDate2 = trans2.format(date);
		System.out.println(transDate1);
		System.out.println(transDate2);
		//////////////////////////////////////////////////////
		Calendar calendar = new GregorianCalendar();
		System.out.println(calendar.getTime());
		String changed = trans2.format(calendar.getTime());
		System.out.println("changed : " + changed);
	}

}
