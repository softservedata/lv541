package Homework;

public class Penguin extends NonFlyingBird {
	private String name;

	public Penguin(String name,boolean feathers, int layEggs) {
		super(feathers, layEggs);
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Penguin{" + "name=' " + name + "}" +  super.toString();
	}
	
	
	

}
