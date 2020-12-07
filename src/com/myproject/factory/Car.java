package com.myproject.factory;

//import java.util.Random;

public class Car {
	private Engine carEngine;
	private Cab carCab;
	private ¿ccessories car¿ccessor;
	private int ID;
	
	public Car() {
		carEngine = null;
		carCab = null;
		car¿ccessor = null;
		ID = getRandomID();
	}
	//public Car(Engine carEngine, Cab carCab, ¿ccessories car¿ccessor) {
	//	super();
	//	this.carEngine = carEngine;
	//	this.carCab = carCab;
	//	this.car¿ccessor = car¿ccessor;
	//	ID = getRandomID();
	//}
	public Engine getCarEngine() {
		return carEngine;
	}
	public void setCarEngine(Engine carEngine,Worker currentWorker) {
		this.carEngine = carEngine;
		AppMain.df.workerSetOutput(currentWorker,carEngine);
	}
	public Cab getCarCab() {
		return carCab;
	}
	public void setCarCab(Cab carCab,Worker currentWorker) {
		this.carCab = carCab;
		AppMain.df.workerSetOutput(currentWorker,carCab);
	}
	public ¿ccessories getCar¿ccessor() {
		return car¿ccessor;
	}
	public void setCar¿ccessor(¿ccessories car¿ccessor,Worker currentWorker) {
		this.car¿ccessor = car¿ccessor;
		AppMain.df.workerSetOutput(currentWorker,car¿ccessor);
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	
	@Override
	public String toString() {
		return "Car [ID=" + ID +"]";
	}
	
	private int getRandomID() {
        //Random random = new Random();
		//return random.nextInt();
		return (int) (100000+Math.random()*500000);
	}
	

}
