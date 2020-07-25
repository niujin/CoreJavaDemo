package comparable.vs.comparator;



public class A implements Comparable<A>{
	int x;
	A(int x){
		this.x =x;
	}
	@Override
	public int compareTo(A a){
		
		if(x> a.x){
			return 1;
		}else if (x==a.x){
			return 0;
		}else{
			return -1;
		}
		
	}
	
}
