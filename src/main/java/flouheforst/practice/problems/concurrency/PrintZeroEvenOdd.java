package flouheforst.practice.problems.concurrency;

import java.util.function.IntConsumer;

public class PrintZeroEvenOdd {
    private final int n;
    private int i = 1;
    private boolean flag = true;
    
    public PrintZeroEvenOdd(int n) {
        this.n = n;
    }
    
    public static void main(String[] args) {
        PrintZeroEvenOdd pz = new PrintZeroEvenOdd(5);
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pz.zero(System.out::println);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        
        
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pz.even(System.out::println);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pz.odd(System.out::println);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        
        t1.start();
        t2.start();
        t3.start();
    }
    
    // printNumber.accept(x) outputs "x", where x is an integer.
    public void zero(IntConsumer printNumber) throws InterruptedException {
        synchronized (this) {
            while (i <= n) {
                if (!flag) {
                    wait();
                } else {
                    printNumber.accept(0);
                    flag = false;
                    notifyAll();
                }
            }
        }
    }
    
    public void even(IntConsumer printNumber) throws InterruptedException {
        synchronized (this) {
            while (i <= n) {
                if (i % 2 != 0 || flag) {
                    wait();
                } else {
                    printNumber.accept(i);
                    flag = true;
                    i++;
                    notifyAll();
                }
            }
        }
    }
    
    public void odd(IntConsumer printNumber) throws InterruptedException {
        synchronized (this) {
            while (i <= n) {
                if (i % 2 == 0 || flag) {
                    wait();
                } else {
                    printNumber.accept(i);
                    flag = true;
                    i++;
                    notifyAll();
                }
            }
        }
    }
}
