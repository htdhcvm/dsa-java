package flouheforst.practice.helpers;

public class Generate {
    
    public static Integer getRandomFromRange(
            Integer min,
            Integer max
    ) {
        return (int) ((Math.random() * (max - min)) + min);
    }
    
    public static int[] generateArray(
            Integer size,
            Integer start,
            Integer end
    ) {
        int[] response = new int[size];
        
        for (int i = 0; i < size; i++) {
            final int value = Generate.getRandomFromRange(start, end);
            response[i] = value;
        }
        
        
        return response;
    }
}
