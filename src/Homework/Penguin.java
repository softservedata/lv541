package Homework;

public class Penguin extends NonFlyingBird {
	private String name;

	public Penguin(boolean feathers, int layEggs, String name) {
		super(feathers, layEggs);
		this.name = name;
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
