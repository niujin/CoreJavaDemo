package com.mercury.inc;

import java.util.ArrayList;

public class MySet<String> {
	private ArrayList<String> elements;
	private ArrayList<Integer> hashCodes;
	
	public boolean add(String element){
		elements.add(element);
		//elements.add
		return true;
	}
	
	@SuppressWarnings("finally")
	public int size(){
		try{
			throw new Exception();
		}catch(Exception a){
			return 10;
		}finally{
			return 20;
		}
	}
}
