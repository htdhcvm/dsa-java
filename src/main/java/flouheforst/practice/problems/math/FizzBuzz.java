package flouheforst.practice.problems.math;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> response = new ArrayList<>();
        
        for (int i = 1; i <= n; i++) {
            double resThree = (double) i / (double) 3;
            double resFive = (double) i / (double) 5;
            
            if (resThree % 1 == 0 && resFive % 1 == 0) {
                response.add("FizzBuzz");
                continue;
            }
            
            if (resFive % 1 == 0) {
                response.add("Buzz");
                continue;
            }
            if (resThree % 1 == 0) {
                response.add("Fizz");
                continue;
            }
            
            response.add(String.valueOf(i));
        }
        
        return response;
    }
}
