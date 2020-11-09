package Homework;

public class FlyingBird extends Bird {
 public FlyingBird(boolean feathers, int layEggs) {
	 super(feathers, layEggs);
 }
	
	
	@Override
 boolean fly() {
 return true;
 }
 
}
