package com.myproject.factory;

//import java.util.Random;

public class Cab extends BaseDetail<CabSupplier>{
	
	@Override
	public String toString() {
		return "Cab [id=" + getId() + "], "+getSupplier();
	}


	public Cab(CabSupplier supplier) {
		super(supplier);

	}
	
	public Cab(CabSupplier supplier,int id) {
		super(supplier,id);

	}
	
	@Override
	public int getRandomID() {
        //Random random = new Random();
		return (int) (10000+Math.random()*50000);
	}
}
