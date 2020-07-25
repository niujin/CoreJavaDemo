package Example2;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadBack {
	
	public static void readback(){
		try{
			int x;
			double y;
			boolean z;
			FileInputStream fis = new FileInputStream("D:\\test2.dat");
			BufferedInputStream bfis = new BufferedInputStream(fis);
			DataInputStream rdata = new DataInputStream(bfis);
			x=rdata.readInt();
			y=rdata.readDouble();
			z=rdata.readBoolean();
			System.out.println(x+"\n"+y+"\n"+z);
			rdata.close();
			bfis.close();
			fis.close();
		}catch(IOException e){
			e.printStackTrace();
		}	
		
	}
}
