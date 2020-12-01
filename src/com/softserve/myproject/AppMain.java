package com.softserve.myproject;

public class AppMain {
	public static Object monitor = new Object();
	
	public static void main(String[] args) {
		Spoon sp1 = new Spoon(1);
		Spoon sp2 = new Spoon(2);
		Spoon sp3 = new Spoon(3);
		Spoon sp4 = new Spoon(4);
		Spoon sp5 = new Spoon(5);
		
		Man m1 = new Man(sp1,sp2,1);
		Man m2 = new Man(sp2,sp3,2);
		Man m3 = new Man(sp3,sp4,3);
		Man m4 = new Man(sp4,sp5,4);
		Man m5 = new Man(sp5,sp1,5);
		
		
		
		//Thread t1 = new Thread(m1);
		//Thread t2 = new Thread(m2);
		//Thread t3 = new Thread(m3);
		//Thread t4 = new Thread(m4);
		//Thread t5 = new Thread(m5);
		//t1.start();
		//t2.start();
		//t3.start();
		//t4.start();
		//t5.start();
		System.out.println("end");

	}

}
