package com.softserve.myproject;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class Man implements Runnable{
	private final Spoon leftSpoon;
	private final Spoon rightSpoon;
	private final int number;

	public int getNumber() {
		return number;
	}

	public Spoon getLeftSpoon() {
		return leftSpoon;
	}

	public Spoon getRightSpoon() {
		return rightSpoon;
	}
	

	public Man() {
		super();
		leftSpoon = null;
		rightSpoon = null;
		number = 0;
	}	
	
	public Man(Spoon leftSpoon, Spoon rightSpoon,int number) {
		super();
		this.leftSpoon = leftSpoon;
		this.rightSpoon = rightSpoon;
		this.number = number;
	}
	
	public void think() {

        System.out.println("The man " +number+ ": " + Thread.currentThread().getName() + " is thinking");
        try {
			Thread.sleep(getRandomInt());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    }
	
	protected void eat(){
     
        System.out.println("The man " +number+ ": " +Thread.currentThread().getName() + " is eating");

        try {
			Thread.sleep(getRandomInt());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
  
    }
	private int getRandomInt() {
        return (int) (Math.random() * 5);
    }
	
	@Override
    public void run() {

			if (leftSpoon.isAvailability()) {
				leftSpoon.take();
			}
			if (rightSpoon.isAvailability()) {
				rightSpoon.take();
			}

			
	
           // while (!stopped.get()) {
                think();
               // state.takeForks(id, leftFork, rightFork);
                eat();
                //state.putForks(id, leftFork, rightFork);
            //}
 
    }

}
