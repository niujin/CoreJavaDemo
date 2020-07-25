package Problem4;

import java.util.ArrayList;
import java.util.List;

public class Problem4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<A> list = new ArrayList<A>();
		list.add(new B());
		list.add(new C());
		for(A a:list){
			a.x();
			//a.y();
		}
	}

}

interface A{
	void x();
}

class B implements A{
	
	@Override
	public void x(){
		System.out.println("B.x");
	}
	public void y(){
		System.out.println("B.y");
	}
}
class C extends B{
	public void x(){
		System.out.println("C.x");
	}
}