class mynewThread extends Thread {
    public void run() {
        System.out.println("Running Thread : " + getName());
        System.out.println("Priority: " + getPriority());
    }

}

class myThread {
    public static void main(String args[]) {
        mynewThread t1 = new mynewThread();
        mynewThread t2 = new mynewThread();
        mynewThread t3 = new mynewThread();

        t1.setName("T 1");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Exception handled: " + e);
        }

        t2.setName("T 2");
        t3.setName("T 3");

        try {
            t1.join();
        } catch (InterruptedException e) {
            System.out.println("Exception handled: " + e);
            Thread.currentThread().interrupt();
        }

        
        // t1.setPriority(10);
        t1.setPriority(Thread.MAX_PRIORITY);// 10
        // t2.setPriority(5);
        t2.setPriority(Thread.MIN_PRIORITY);// 1
        // t3.setPriority(1);
        t3.setPriority(Thread.NORM_PRIORITY);// 5
        t1.start();
        t2.start();
        t3.start();

    }
}
