package com.myproject.factory;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AppMain {
	public static Object monitor = new Object();
	public static Object monitorForSupplier = new Object();

	public static void main(String[] args) {
		CabWarehouse CabW= new CabWarehouse();
		CabSupplier cs1 = new CabSupplier("Good cabs",CabW,10);
		CabSupplier cs2 =new CabSupplier("Strong cabs",CabW,15);
		
		ÀccessoriesWarehouse accW = new ÀccessoriesWarehouse();
		ArrayList<Supplier> supplierArray = new ArrayList<Supplier>();
		for(int k = 0 ; k < 5; k++) {
			supplierArray.add(new Supplier("Supplier"+k,accW,5));	
		}
		//Worker w1 = new Worker("Ivan");
		//Worker w2 = new Worker("Petro");
		//Worker w3 = new Worker("Dmytro");
		ExecutorService service = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		for(Supplier s : supplierArray) {
			service.execute(s);	
		}
		service.shutdown();
		
		ExecutorService service2 = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		service2.execute(cs1);
		service2.execute(cs2);
		service2.shutdown();

	}

}
