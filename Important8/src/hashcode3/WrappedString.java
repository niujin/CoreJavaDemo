package hashcode3;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class WrappedString {
	String str;
	WrappedString(String str){
		this.str=str;
	}
	@Override
	public int hashCode(){
		//Random r = new Random();
		//int i = r.nextInt()%100;
		return str.hashCode();
		//return 10;
	}
	public boolean equals(Object obj){
		if(! (obj instanceof WrappedString))
			return false;
		WrappedString ws = (WrappedString) obj;
		return str.equals(ws.str);
		//return false;
	}
	public static void main(String args[]){
		Set<WrappedString> set = new HashSet<WrappedString>();
		//WrappedString ws[] = new WrappedString[10];
		WrappedString ws = new WrappedString("abc");
		WrappedString ws1 = new WrappedString("abc");
		for(int i=0;i<10;i++){
		//	ws[i]= new WrappedString("abc");
			set.add(ws);
		}
		set.add(ws1);
		System.out.println(set.size());		
	}
}
