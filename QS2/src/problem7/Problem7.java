package problem7;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Problem7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Forest forest = new Forest();
		try{
			FileOutputStream file=new FileOutputStream("file.doc");
			ObjectOutputStream out= new ObjectOutputStream(file);
			out.writeObject(forest);
			out.close();
			file.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
class Forest implements Serializable{
	public Tree tree = new Tree();
	
}
class Tree{}