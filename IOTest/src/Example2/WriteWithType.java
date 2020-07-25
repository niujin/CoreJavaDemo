package Example2;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import Example1.ReadBack;

public class WriteWithType {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=1234567;
		double d = 3.1415926;
		boolean b = true;
		try{
			FileOutputStream fos = new FileOutputStream("D:\\test2.dat");
			BufferedOutputStream bfos = new BufferedOutputStream(fos);
			DataOutputStream data = new DataOutputStream(bfos);
			data.writeInt(x);
			data.writeDouble(d);
			data.writeBoolean(b);
			data.close();
			bfos.close();
			fos.close();
					
		}catch(IOException e){
			e.printStackTrace();
		}	
		ReadBack.readback();
	}
}
