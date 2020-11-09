package Homework;

public class Swallow extends FlyingBird {
	private int name;

	public Swallow(boolean feathers, int layEggs, int name) {
		super(feathers, layEggs);
		setName(name);
	}

	public int getName() {
		return name;
	}

	public void setName(int name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Swallow{" +
	"name=" + name + "}" + super.toString();
	}
	

}
