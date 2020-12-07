package com.myproject.factory;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AppMain {
	public static Object monitorCab = new Object();
	public static Object monitor¿ccessor = new Object();
	public static Object monitorEngine = new Object();
	public static Object monitorCar = new Object();
	public static Object monitorController = new Object();
	public static DialogFactory df = new DialogFactory();

	public static void main(String[] args) {
		
		Factory myFactory = new Factory(); 
		
		CabSupplier cs1 = new CabSupplier("Good cabs",myFactory.getWarehouseCab(),200);
		CabSupplier cs2 = new CabSupplier("Strong cabs",myFactory.getWarehouseCab(),300);
		
		
		EngineSupplier es1 = new EngineSupplier("Engine marker",myFactory.getWarehouseEngine(),300);
		

		ArrayList<Supplier> supplierArray = new ArrayList<Supplier>();
		for(int k = 0 ; k < 5; k++) {
			supplierArray.add(new Supplier("Supplier"+k,myFactory.getWarehouse¿ccessories(),50));	
		}


		ExecutorService service = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		service.execute(cs1);
		service.execute(cs2);
		service.execute(es1);
		for(Supplier s : supplierArray) {
			service.execute(s);	
		}
		service.shutdown();
		
		/*-Controller Control = new Controller();
		ExecutorService serviceForController = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		serviceForController.execute(Control);
		serviceForController.shutdown();*/
		
		
		ExecutorService serviceForProduction = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		for(CarProductionWorker production : myFactory.getProduction()) {
			serviceForProduction.execute(production);	
		}
		serviceForProduction.shutdown();
		
       // DialogFactory df = new DialogFactory();
		AppMain.df.setVisible(true);

       

	}


}
