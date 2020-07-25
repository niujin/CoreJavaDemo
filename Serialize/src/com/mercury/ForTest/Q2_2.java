package com.mercury.ForTest;

import java.io.*;

class Food {	//
	Food() {
		System.out.println("Food");
	}
}

class Fruit extends Food implements Serializable {

	Fruit() {
		System.out.println("2");
	}
}

class Banana extends Fruit {

	static int size = 50;

	void serializeBanana(Banana b){
		try{FileOutputStream file=new FileOutputStream("file.doc");
		ObjectOutputStream out= new ObjectOutputStream(file);
		out.writeObject(b);
		out.close();
		file.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	Object deserializeBanana(){
		Object ba = null;
		try{
			FileInputStream fin= new FileInputStream("file.doc");
			ObjectInputStream in= new ObjectInputStream(fin);
			ba=in.readObject();
			in.close();
			fin.close();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return ba;
	}
}

public class Q2_2 {
	public static void main(String[] args) {
		Banana b = new Banana();
		//b.size=50;
		Banana ba= null;
		
		b.serializeBanana(b);
		ba = (Banana)b.deserializeBanana();
		//ba.size++;
		System.out.println("restored " + Banana.size);
	}
}

