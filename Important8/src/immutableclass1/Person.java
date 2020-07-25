package immutableclass1;

public final class Person{

	private String str;
	Person(){}
	Person(String str){
		this.str=str;
	}
	public String getName(){
		return str;
	}
	public Person addPrefix(String prefix){
		return new Person(prefix+" "+str);
	}
}
