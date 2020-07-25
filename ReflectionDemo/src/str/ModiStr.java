package str;

import java.lang.reflect.*;

public class ModiStr {
	void foo(String str){
		Class<?> strClass = str.getClass();
		Field fields[]=strClass.getDeclaredFields();
		
		for(int i=0;i<fields.length;i++){
			Field fld = fields[i];
			System.out.print(fld.getName());
			System.out.print("\t");
			System.out.print("declar class= "+fld.getDeclaringClass());
			System.out.print("\t");
			System.out.print("type= "+fld.getType());
			int mod=fld.getModifiers();
			System.out.print("\t");
			System.out.print("Modifers: "+Modifier.toString(mod));
			System.out.print("\t");
			System.out.println(fld.toString());
			
		}
	}
	void foo1(String str){
		Class<?> strClass = str.getClass();
		Field fld;
		try {
			fld=strClass.getDeclaredField("value");
			String str1="Hello";
			fld.setAccessible(true);
			fld.set(str, str1.toCharArray());
			fld=strClass.getDeclaredField("count");
			fld.setAccessible(true);
			fld.set(str, 5);
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String args[]){
		String str ="abc";
		ModiStr ms = new ModiStr();
		ms.foo1(str);
		System.out.println("abc");
	}
}
