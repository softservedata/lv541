package Homework;

public class Chicken extends NonFlyingBird {
	private String name;

	public Chicken(boolean feathers, int layEggs, String name) {
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
		return "Chicken{" +
	"name=" + name + "}" + super.toString();
	} 
	
	

}
