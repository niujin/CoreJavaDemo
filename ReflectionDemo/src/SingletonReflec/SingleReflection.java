package SingletonReflec;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingleReflection {
	public static void main(String args[]){
		Constructor<?> cons[] = MySingleton.class.getDeclaredConstructors();
		//System.out.println()
		//System.out.println();
		Constructor<?> c = cons[0];
		c.setAccessible(true);
		//System.out.println(c);
		try {
			MySingleton ms1 = (MySingleton) c.newInstance();
			MySingleton ms2 = (MySingleton) c.newInstance();
			MySingleton ms3 = (MySingleton) c.newInstance();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
