package task4;

public class Car {
	public String model;
	public int year;
	public double engine;
	
	public Car(String model, int year, double engine) {
		this.model = model;
		this.year = year;
		this.engine = engine;
	}
	
	public String print() {
		return "Model: " + this.model
				+ ". Year: " + this.year
				+ ". Engine: " + this.engine;
	}
 }