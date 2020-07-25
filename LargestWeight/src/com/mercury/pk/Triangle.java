package com.mercury.pk;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Triangle {

	/**
	 * @param args
	 */
	public int sweight=0;
	public int rowCount=0;
	//public int a[][]={{5,0,0,0},{9,6,0,0},{4,6,8,0},{0,7,1,5}};
	public List<Integer> list;
	public void visit(int i, int j,int weight){
		int lweight = weight+list.get(i*(i+1)/2+j);
		if(i==rowCount-1){
			if(lweight>=sweight){
				sweight=lweight;
			}
		}else{		
			visit(i+1,j,lweight);
			visit(i+1,j+1,lweight);
		}
	}
	public int findPath(String file){
		File f  = new File(file);
		try {
			Scanner s = new Scanner(f);
			list = new ArrayList<Integer>();
			while(s.hasNextInt()){
				
				list.add(s.nextInt());
			}
			
			s = new Scanner(f);
			while(s.hasNextLine()){
				s.nextLine();
				rowCount++;
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		visit(0,0,0);
		
		return sweight;
	}
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle sg = new Triangle();
		
		System.out.println(sg.findPath("D:\\triangle.txt"));
	}
}
