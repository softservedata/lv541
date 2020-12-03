package com.myproject.factory;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AppMain {
	public static Object monitor = new Object();
	public static Object monitorForSupplier = new Object();
	public static DialogFactory df = new DialogFactory();

	public static void main(String[] args) {
		CabWarehouse CabW= new CabWarehouse(20);
		
		CabSupplier cs1 = new CabSupplier("Good cabs",CabW,200);
		CabSupplier cs2 = new CabSupplier("Strong cabs",CabW,300);
		
		ÀccessoriesWarehouse accW = new ÀccessoriesWarehouse(15);
		ArrayList<Supplier> supplierArray = new ArrayList<Supplier>();
		for(int k = 0 ; k < 5; k++) {
			supplierArray.add(new Supplier("Supplier"+k,accW,50));	
		}

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
		
       // DialogFactory df = new DialogFactory();
		AppMain.df.setVisible(true);

       

	}

}
