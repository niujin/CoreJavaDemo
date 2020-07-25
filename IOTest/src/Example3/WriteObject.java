package Example3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			FileOutputStream fos = new FileOutputStream("d://test3.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			A a = new A();
			oos.writeObject(a);
			oos.close();
			fos.close();
			ReadObject.readObj();
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}
