package com.myproject.factory;

public class �ccessories extends BaseDetail<Supplier>{
  
    
	@Override
	public String toString() {
		return "�ccessor [id=" + getId() + "], "+getSupplier();
	}


	public �ccessories(Supplier supplier) {
		super(supplier);
	
	}
	
	public �ccessories(Supplier supplier, int id) {
		super(supplier,id);
	
	}
	
	@Override
	public int getRandomID() {
        //Random random = new Random();
		return (int) (10000000+Math.random()*50000000);

	}
	

}
