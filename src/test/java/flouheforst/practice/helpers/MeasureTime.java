package flouheforst.practice.helpers;

public class MeasureTime {
    
    public static void measure(Runnable task) {
        long startTime = System.currentTimeMillis();
        task.run();
        long elapsed = System.currentTimeMillis() - startTime;
        System.out.println("Time: " + elapsed + " ms.");
    }
}
