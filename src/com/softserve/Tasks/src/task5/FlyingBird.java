package task5;

public class FlyingBird extends Bird {

	@Override
	public void fly() {
		System.out.println(this.getClass().getName().substring(6) + " can fly.");
	}

}