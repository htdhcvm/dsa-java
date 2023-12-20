package flouheforst.practice.problems.concurrency;

public class PrintFooBarAlternately {
    private final int n;
    private int i;
    private boolean a = true;
    
    public PrintFooBarAlternately(int n) {
        this.n = n;
    }
    
    public void foo(Runnable printFoo) throws InterruptedException {
        synchronized (this) {
            while (i <= n) {
                if (!a) {
                    wait();
                }
                
                printFoo.run();
                a = false;
                notifyAll();
            }
        }
    }
    
    public void bar(Runnable printBar) throws InterruptedException {
        
        synchronized (this) {
            while (i <= n) {
                if (a) {
                    wait();
                }
                
                printBar.run();
                a = true;
                i++;
                notifyAll();
            }
        }
    }
}
