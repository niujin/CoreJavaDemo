package Example1;
import java.io.*;
public class FileIO {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[]={-1,2,3,4,257};
		int m=1234567;
		double d = 3.1415926;
		boolean b = true;
		try{
			FileOutputStream fos = new FileOutputStream("D:\\test1.dat");
			BufferedOutputStream bfos = new BufferedOutputStream(fos);
			DataOutputStream data = new DataOutputStream(bfos);
			data.writeInt(m);
			data.writeDouble(d);
			data.writeBoolean(b);
			data.close();
			bfos.close();
			fos.close();
//			for(int y:x){
//				fos.write(y);
//			}
			//fos.close();						
		}catch(IOException e){
			e.printStackTrace();
		}	
		ReadBack.readback();
	}

}
