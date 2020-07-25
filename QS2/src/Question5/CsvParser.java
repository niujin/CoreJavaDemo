package Question5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CsvParser {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(100381,"Lee","Steven",31, Student.Sex.MALE,false);
		Student s2 = new Student(102546,"Wang","Tracy",23, Student.Sex.FEMALE,true);
		Student s3 = new Student(100088,"Munson","Alex",28, Student.Sex.MALE,true);
		Student s4 = new Student(176542,"George","Jeffery",26, Student.Sex.MALE,true);
		List<Student> ls = new ArrayList<Student>();
		ls.add(s1);	ls.add(s2);
		ls.add(s3);	ls.add(s4);
		
		Collections.sort(ls, new Comparator<Student>(){
			@Override
			public int compare(Student a, Student b){
				if(a.getID()>b.getID()){
					return 1;
				}else if(a.getID()==b.getID()){
					return 0;
				}else{
					return -1;
				}
			}
		});
		
		Collections.sort(ls, new Comparator<Student>(){
			@Override
			public int compare(Student a, Student b){
				String aName= a.getlName()+a.getfName();
				String bName= b.getlName()+b.getfName();
				if(aName.length()<bName.length()){
					int i;
					for(i=0;i<aName.length();){
						if(aName.charAt(i)>bName.charAt(i)){
							return 1;
						}else if(aName.charAt(i)<bName.charAt(i)){
							return -1;
						}else{
							i++;
						}
					}
					return 1;
				}else if(aName.length()>bName.length()){
					int i=0;
					for(i=0;i<bName.length();){
						if(aName.charAt(i)>bName.charAt(i)){
							return 1;
						}else if(aName.charAt(i)<bName.charAt(i)){
							return -1;
						}else{
							i++;
						}
					}
					return 1;
				}else{
					int i=0;
					for(i=0;i<aName.length();){
						if(aName.charAt(i)>bName.charAt(i)){
							return 1;
						}else if(aName.length()<bName.length()){
							return -1;
						}else{
							i++;
						}
					}
					return 0;
				}
			}
		});
		
		for(Student t:ls){
			System.out.println(t.getID()+t.getlName()+t.getfName()+t.getSex()+t.getAge()+t.onTraining);
		}
		try {
			FileWriter fw = new FileWriter("D:\\students.csv");
			BufferedWriter bw = new BufferedWriter(fw);
			for(Student t:ls){
				bw.write((t.getID()+","+t.getlName()+","+t.getfName()+","+t.getAge()+","+t.getSex()+","+t.onTraining+'\n'));
			}
			bw.flush();
			bw.close();
			fw.close();
			FileReader fr = new FileReader("D:\\students.csv");
			BufferedReader br = new BufferedReader(fr);
			fw = new FileWriter("D:\\male_students.csv");
			bw = new BufferedWriter(fw);
			String str, sub[];
			while((str=br.readLine())!=null){
				//System.out.println(str);
				sub=str.split(",");
				if(sub[4].equals("MALE")){
					bw.write(str+'\n');
				}
			}
			br.close();
			fr.close();
			fw.flush();
			bw.close();
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
