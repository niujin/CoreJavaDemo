package com.mercury.parser;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ParseCSV {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader fr = new FileReader("D:\\quotes.csv");
			BufferedReader br = new BufferedReader(fr);
			String content = br.readLine();
			//content = content.replace((char)34, (char)32);
			boolean flag =true;
			int j=0;
			for(int i=0;i<content.length();i++){
				if(content.charAt(i)=='"'){
					j=j+1;
					if(j%2!=0){
						flag=false;
					}else{
						flag=true;
					}					
				}
				if(content.charAt(i)==','&&flag==true){
					content=content.substring(0, i)+"`"+content.substring(i+1);
				}
			}
			System.out.println(content);
			String ary[]= content.split("`");
			System.out.println(ary.length);
			for(String a:ary){
				a=a.replace((char)34, (char)32);
				System.out.println(a);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e){
			e.printStackTrace();
		}
		
	}

}
