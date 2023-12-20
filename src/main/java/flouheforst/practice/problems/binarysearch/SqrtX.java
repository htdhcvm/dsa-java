package flouheforst.practice.problems.binarysearch;

public class SqrtX {
    public int solution(int x) {
        if (x == 1 || x == 0)
            return x;
        
        int iter = 1;
        
        int pow = 0;
        
        while (pow < x) {
            pow = iter * iter;
            
            if (pow >= x) {
                break;
            }
            
            iter *= 2;
        }
        
        if (pow == x) {
            return iter;
        }
        
        
        int left = iter / 2;
        int right = iter;
        
        while (left < right) {
            int mid = left + (right - left);
            
            pow = mid * mid;
            
            if (pow == x) {
                return iter;
            }
            
            if (pow < x) {
                left = mid + 1;
            }
            if (pow > x) {
                right = mid;
            }
        }
        
        return 0;
    }
}
