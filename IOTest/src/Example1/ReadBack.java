package Example1;

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
			FileInputStream fis = new FileInputStream("D:\\test1.dat");
			BufferedInputStream bfis = new BufferedInputStream(fis);
			DataInputStream rdata = new DataInputStream(bfis);
			x=rdata.readInt();
			y=rdata.readDouble();
			z=rdata.readBoolean();
			System.out.println(x+"\n"+y+"\n"+z);
//			int num;
//			while((num=fis.read())!=-1){
//				System.out.println(num);
//			}
			rdata.close();
			bfis.close();
			fis.close();
		}catch(IOException e){
			e.printStackTrace();
		}	
		
	}
}
