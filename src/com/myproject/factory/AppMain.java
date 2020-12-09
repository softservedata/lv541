package com.myproject.factory;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AppMain {
	public static Object monitorController = new Object();
	public static DialogFactory df = new DialogFactory();
	public static int carNumber = 1;
	public static int cabNumber = 1;
	public static void main(String[] args) {
		
		Factory myFactory = new Factory(); 
		
		CabSupplier cs1 = new CabSupplier("Good cabs",myFactory.getWarehouseCab(),10);
		CabSupplier cs2 = new CabSupplier("Strong cabs",myFactory.getWarehouseCab(),31);
		
		
		EngineSupplier es1 = new EngineSupplier("Engine marker",myFactory.getWarehouseEngine(),42);
		

		ArrayList<Supplier> supplierArray = new ArrayList<Supplier>();
		for(int k = 0 ; k < 5; k++) {
			supplierArray.add(new Supplier("Supplier"+k,myFactory.getWarehouseÀccessories(),10));	
		}
		
		Dealer dealer1 = new Dealer("First dealer",myFactory.getWarehouseCar(),6000);
		Dealer dealer2 = new Dealer("Second dealer",myFactory.getWarehouseCar(),8000);


		ExecutorService service = Executors.newFixedThreadPool(10);
		service.execute(cs1);
		service.execute(cs2);
		service.execute(es1);
		service.execute(dealer1);
		service.execute(dealer2);
		for(Supplier s : supplierArray) {
			service.execute(s);	
		}
		service.shutdown();
		
		myFactory.startProduction();
			
		AppMain.df.setVisible(true);	
		//ExecutorService serviceS = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

		//for(Supplier s : supplierArray) {
		//	serviceS.execute(s);	
		//}
		//serviceS.shutdown();
		
		/*-
		ExecutorService serviceForProduction = Executors.newFixedThreadPool(3);
		for(CarProductionWorker production : myFactory.getProduction()) {
			serviceForProduction.execute(production);	
		}
		serviceForProduction.shutdown();
		*/			
		/*-
		Controller Control = new Controller();
		ExecutorService serviceForController = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		serviceForController.execute(Control);
		serviceForController.shutdown();
		*/
		

       // DialogFactory df = new DialogFactory();


       

	}


}
