package com.mercury.ForTest;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;


class B implements Externalizable{

	public String str;
	public int a;
	B(){};
	B(String str, int a){
		this.str=str;
		this.a=a;
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException,
			ClassNotFoundException {
		// TODO Auto-generated method stub
		a=in.readInt();
		str=(String)in.readObject();
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		out.writeInt(a);
		out.writeObject(str);
	}
	
	@Override
	public String toString(){
		return this.str+"\t"+this.a;
	}
	
}
public class ExternalizableDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B("Bob",25);
		try {
			FileOutputStream fos = new FileOutputStream("file.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			b.writeExternal(oos);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		B b1= new B();
		try {
			FileInputStream fis = new FileInputStream("file.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			b1.readExternal(ois);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(b1);
		
	}

}
