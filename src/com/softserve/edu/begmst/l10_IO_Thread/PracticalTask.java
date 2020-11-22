package com.softserve.edu.begmst.l10_IO_Thread;

public class PracticalTask {
	public static void task1() {
		for (int i = 0; i < 10; i++) {
			System.out.println("I study Java");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println("Interrupted Exception");				
			}
		}
		
	}
	public static void main(String[] args) {
		PracticalTask.task1();
	}
}
