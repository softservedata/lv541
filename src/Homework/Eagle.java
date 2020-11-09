package Homework;

public class Eagle extends FlyingBird {
	private String name;

	public Eagle(boolean feathers, int layEggs, String name) {
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
		return "Eagle{" + "name=' " + name + "}" +  super.toString();
	}
	

}
