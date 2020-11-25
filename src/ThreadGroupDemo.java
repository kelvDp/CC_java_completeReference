public class ThreadGroupDemo {
    public static void main(String[] args) {
        ThreadGroup groupA = new ThreadGroup("Group A");
        ThreadGroup groupB = new ThreadGroup("Group B");

        NewThread ob1 = new NewThread("One", groupA);
        NewThread ob2 = new NewThread("Two", groupA);
        NewThread ob3 = new NewThread("Three", groupB);
        NewThread ob4 = new NewThread("Four", groupB);

        ob1.start();
        ob2.start();
        ob3.start();
        ob4.start();

        System.out.println("Here is the output from list(): ");
        groupA.list();
        groupB.list();
        System.out.println();

        System.out.println("Suspending Group A");
        Thread[] tga = new Thread[groupA.activeCount()];
        groupA.enumerate(tga); // get threads in group
        for (Thread thread : tga) {
            ((NewThread) thread).mySuspend(); // suspend each thread
        }

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Resuming group A");
        for (Thread thread : tga) {
            ((NewThread) thread).myResume(); // resume all threads in group
        }

        // wait for threads to finish
        try {
            System.out.println("Waiting for threads to finish");
            ob1.join();
            ob2.join();
            ob3.join();
            ob4.join();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Main thread exiting");
    }
}

class NewThread extends Thread {
    // Demonstrate thread groups

    boolean suspendFlag;

    NewThread(String threadName, ThreadGroup tgOb) {
        super(tgOb, threadName);
        System.out.println("New Thread: " + this);
        suspendFlag = false;
    }

    // This is the entry point for thread
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(getName() + ": " + i);
                Thread.sleep(1000);
                synchronized (this) {
                    while (suspendFlag) {
                        wait();
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Exception in " + getName());
        }
        System.out.println(getName() + " exiting.");
    }

    synchronized void mySuspend() {
        suspendFlag = true;
    }

    synchronized void myResume() {
        suspendFlag = false;
        notify();
    }
}