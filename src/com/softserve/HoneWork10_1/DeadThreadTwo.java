package com.softserve.HoneWork10_1;

public class DeadThreadTwo implements Runnable{

	@Override
	public void run() {
		synchronized (DeadLock.monitor2) {
            System.out.println("DeadThreadTwo is holding LOCK 2...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("DeadThreadOne is waiting for Lock 1...");
            synchronized (DeadLock.monitor1) {
                System.out.println("DeadThreadOne  is holding Lock 1 and Lock 2...");
            }
        }
		
	}

}
