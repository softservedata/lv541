package com.myproject.factory;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AppMain {
	public static Object monitorController = new Object();
	public static DialogFactory df = new DialogFactory();

	public static void main(String[] args) {
		
		Factory myFactory = new Factory(); 
		
		CabSupplier cs1 = new CabSupplier("Good cabs",myFactory.getWarehouseCab(),200);
		CabSupplier cs2 = new CabSupplier("Strong cabs",myFactory.getWarehouseCab(),300);
		
		
		EngineSupplier es1 = new EngineSupplier("Engine marker",myFactory.getWarehouseEngine(),300);
		

		ArrayList<Supplier> supplierArray = new ArrayList<Supplier>();
		for(int k = 0 ; k < 5; k++) {
			supplierArray.add(new Supplier("Supplier"+k,myFactory.getWarehouseÀccessories(),50));	
		}


		ExecutorService service = Executors.newFixedThreadPool(8);
		service.execute(cs1);
		service.execute(cs2);
		service.execute(es1);
		for(Supplier s : supplierArray) {
			service.execute(s);	
		}
		service.shutdown();
		
		myFactory.startProduction();
		
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
		AppMain.df.setVisible(true);

       

	}


}
