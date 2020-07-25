package construct;

public class Test {
	
}
class Plant {
	String name;
	public Plant(String name){
		this.name=name;
	}
	public String getName(){
		return this.name;
	}
}
class Tree extends Plant{
	Tree(){
	super("tree");
	}
	public void growFruit(){};
	public void dropLeave(){};
	
}
