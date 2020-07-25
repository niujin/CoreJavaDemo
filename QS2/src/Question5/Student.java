package Question5;

public class Student {
	private int ID;
	private String fName;
	private String lName;
	private int age;
	public enum Sex{MALE,FEMALE};
	private Sex s;
	boolean onTraining;
	public Student(int iD,String lName, String fName, int age, Sex s, boolean onTraining){
		this.ID=iD;
		this.fName=fName;
		this.lName=lName;
		this.age=age;
		this.s=s;
		this.onTraining=onTraining;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setSex(Sex s){
		this.s =s;
	}
	public Sex getSex(){
		return this.s;
	}
	public boolean isOnTraining() {
		return onTraining;
	}
	public void setOnTraining(boolean onTraining) {
		this.onTraining = onTraining;
	}

}
