package com.softserve.HoneWork10_1;

public class DeadThreadOne implements Runnable{


	@Override
	public void run() {
		synchronized (DeadLock.monitor1) {
            System.out.println("DeadThreadOne is holding LOCK 1...");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("DeadThreadOne is waiting for Lock 2...");
            synchronized (DeadLock.monitor2) {
                System.out.println("DeadThreadOne  is holding Lock 1 and Lock 2...");
            }
        }
		
	}

}
