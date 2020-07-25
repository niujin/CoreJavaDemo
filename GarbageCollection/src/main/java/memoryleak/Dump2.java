package memoryleak;

public class Dump2 {
/*		static Object[] o;
		static int i=0;
		static{
			while(i<10){
				o= new Object[]{o};
			}
		}*/
//		//System.out.println("static");
	{
		System.out.println(" non static");
	}
	public static void main(String[] args){
//		Dump2 d = new Dump2();
//		String s = new String();
//		while(true){
//			s+="aaa";
//			//System.out.println(s);
//			s.intern();
//		}
		B b =null;
		while(true){
			b = new B();
		}
	}
}
class A{
	static B b=null;

}
class B{
	@Override
	public void finalize(){
		A.b=this;
	}
}