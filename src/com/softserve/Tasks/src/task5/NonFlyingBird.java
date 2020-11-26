package task5;

public class NonFlyingBird extends Bird {

	@Override
	public void fly() {
		System.out.println(this.getClass().getName().substring(6) + " can't fly.");
	}

}