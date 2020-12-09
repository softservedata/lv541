package com.myproject.factory;


public class Engine extends BaseDetail<EngineSupplier>{

		@Override
		public String toString() {
			return "Engine [id=" + getId() + "], "+getSupplier();
		}


		public Engine(EngineSupplier supplier) {
			super(supplier);
		}
		
		public Engine(EngineSupplier supplier, int id) {
			super(supplier, id);
		}
		
		@Override
		public int getRandomID() {
	        //Random random = new Random();
			return (int) (1000+Math.random()*5000);
		}
		

}
