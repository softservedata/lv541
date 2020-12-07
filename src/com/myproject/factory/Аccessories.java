package com.myproject.factory;

public class Àccessories extends BaseDetail<Supplier>{

	@Override
	public String toString() {
		return "Àccessor [id=" + getId() + "], "+getSupplier();
	}


	public Àccessories(Supplier supplier) {
		super(supplier);
	}
	
	@Override
	public int getRandomID() {
        //Random random = new Random();
		return (int) (10000000+Math.random()*50000000);
	}
	

}
