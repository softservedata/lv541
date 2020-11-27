package com.softserve.edu.begmst.l10_IO_Thread;

import java.util.ArrayList;
import java.util.List;

public class Homework {
	
	/**
	 * Run three threads and output there different messages for 5 times.
	 * The third thread supposed to start after finishing working of the two previous threads.
	 */
	public static void task1() {
		Thread t1 = new Thread(new Task1Run("A"));
		Thread t2 = new Thread(new Task1Run("BB"));
		List<Thread> threads = new ArrayList<Thread>();
		t1.start();
		t2.start();
		threads.add(t1);		
		threads.add(t2);		
		Thread t3 = new Thread(new Task1Run("CCC", threads));
		t3.start();
	}

	/**
	 * Cause a deadlock. Organize the expectations of ending a thread in main(),
	 * and make the end of the method main() in this thread.
	 */
	public static void task2() {
		
	}

	/**
	 * Create a thread «one», which would start the thread «two»,
	 * which has to output its number («Thread number two») 3 times and create thread «three»,
	 * which would to output message «Thread number three» 5 times.
	 */
	public static void task3() {
		
	}

	/**
	 * Create file1.txt file with a text about your career.
	 * Read context from file into array of strings. Each array item contains one line from file.
	 * Write in to the file2.txt
	 * 1) number of lines in file1.txt.
	 * 2) the longest line in file1.txt.
	 * 3) your name and birthday date. 
	 */
	public static void task4() {
		
	}

	public static void main(String[] args) {
		task1();
		task2();
		task3();
		task4();
	}

}

class Task1Run implements Runnable {
	private String text;
	private List<Thread> joinThreads = new ArrayList<Thread>();
	
	public Task1Run(String text) {
		this.text = text;
	}
	public Task1Run(String text, List<Thread> threads) {
		this.text = text;
		this.joinThreads.addAll(threads);
	}
	
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getId() + ": " + this.text);
		}
		this.joinThreads.forEach(t -> {
			try {
				t.join();
			} catch (InterruptedException e) {
			}
		});
		System.out.println(Thread.currentThread().getId() + ": " + this.text + ": DONE");
	}
}
