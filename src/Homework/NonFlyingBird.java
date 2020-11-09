package Homework;

public class NonFlyingBird extends Bird {
	
	public  NonFlyingBird(boolean feathers, int layEggs ) {
		super(feathers, layEggs);
	}
    @Override
    boolean fly() {
    	return false;
    }
}
