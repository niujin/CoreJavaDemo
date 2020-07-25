package com.niu.jin;

import java.text.DecimalFormat;


/**
 * text 1
 */
public class ToGenerateJavaDoc {


	
	/**
	 * This is generated text 3
	 */
	public void foo(){
		
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=-1;
		System.out.println(Integer.toBinaryString(i));
		i>>>=10;
		System.out.println(Integer.toBinaryString(i));
		short s =-1;
		System.out.println(Short.toString(s));
		float f1 = 3.5f;
		System.out.println((int) f1);
		char c ='a';
		
		c+=1;
		
		double d = 4166.23456778909;
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.println(df.format(d));
	}

}
