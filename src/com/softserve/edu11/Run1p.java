package com.softserve.edu11;

public class Run1p implements Runnable {

    @Override
    public void run() {
        boolean isnotify = true;
        int k;
        System.out.println("+ Thread ID = " + Thread.currentThread().getId());
        for (int i = 0; i < 100; i++) {
            // Appl.go(Thread.currentThread().getId());
            /*-
            k = Appl.sum;
            try {
            	Thread.sleep(1);
            } catch (InterruptedException e) {
            	e.printStackTrace();
            }
            Appl.sum = k + 1;
            System.out.print("+");
            */
            // /*-
            // synchronized (Appl.class) {
            synchronized (Appl.monitor) {
                k = Appl.sum;
                try {
                    if ((k > 0) && isnotify) {
                        // Appl.monitor.wait();
                        Appl.monitor.notifyAll();
                        System.out.println("***Appl.monitor.notifyAll() done");
                        isnotify = Run1m.isWait;
                    }
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Appl.sum = k + 1;
                System.out.print("+");
                Appl.monitor.notifyAll();
            }
            // */
        }
        System.out.println(" DONE+, sum=" + Appl.sum);
    }
}
