package flouheforst.practice.problems.concurrency;


public class BuildingH2O {
    private int count = 0;
    
    public BuildingH2O() {
    }
    
    public static void main(String[] args) {
        
        BuildingH2O a = new BuildingH2O();
        
        for (int i = 0; i < 20; i++) {
            Thread t1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        a.hydrogen(new Runnable() {
                            @Override
                            public void run() {
                                System.out.println("H");
                            }
                        });
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            });
            
            
            Thread t2 = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        a.oxygen(new Runnable() {
                            @Override
                            public void run() {
                                System.out.println("O");
                            }
                        });
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            });
            
            
            t1.start();
            t2.start();
        }
        
    }
    
    // releaseHydrogen.run() outputs "H". Do not change or remove this line
    public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {
        synchronized (this) {
            while (count == 2) {
                wait();
            }
            
            releaseHydrogen.run();
            count++;
            notifyAll();
            
        }
    }
    
    public void oxygen(Runnable releaseOxygen) throws InterruptedException {
        synchronized (this) {
            while (count < 2) {
                wait();
            }
            
            releaseOxygen.run();
            count = 0;
            notifyAll();
        }
    }
}
