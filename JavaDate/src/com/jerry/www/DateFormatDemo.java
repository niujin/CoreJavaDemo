package com.jerry.www;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatDemo {

	/**
	 * @param args
	 */
	char c=32;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateFormat df = new SimpleDateFormat("yyyyMMDD_HHmm");
		DateFormatDemo demo = new DateFormatDemo();
		System.out.println(df.format(new Date()));
		System.out.println("{"+demo.c+"}");

	}

}
