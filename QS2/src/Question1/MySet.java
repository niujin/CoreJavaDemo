package Question1;

import java.util.ArrayList;

public class MySet {
	private ArrayList<String> elements;
	private ArrayList<Integer> hashCodes;
	private int mysize;
	MySet(){
		this.elements = new ArrayList<String>();
		this.hashCodes = new ArrayList<Integer>();
	}
	public boolean add(String element){
		int loc = element.hashCode()/elements.size();
		if(elements.get(loc)!=null){
			return false;
		}else{
			elements.add(element);
			hashCodes.add(element.hashCode());
			
			return true;
		}
		
	}
	public int size(){
		return mysize;
	}
}
