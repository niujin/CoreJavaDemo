package Example3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ReadObject {
	
	public static void readObj(){
		try{
			FileInputStream fis = new FileInputStream("d://test3.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			A a;
			a=(A) ois.readObject();
			System.out.println(a.x+"\n"+a.d+"\n"+a.b+"\n"+a.m);
			ois.close();
			fis.close();
		}catch(IOException e){
			e.printStackTrace();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
	
}
