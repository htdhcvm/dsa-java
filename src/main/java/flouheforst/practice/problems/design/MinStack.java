package flouheforst.practice.problems.design;

import java.util.ArrayList;

public class MinStack {
    private final ArrayList<Integer> arr = new ArrayList<>();
    private final ArrayList<Integer> arrMin = new ArrayList<>();
    
    public MinStack() {
    
    }
    
    public void push(int val) {
        if (arrMin.isEmpty() || val <= arrMin.get(arrMin.size() - 1)) {
            arrMin.add(val);
        }
        
        arr.add(val);
    }
    
    public void pop() {
        Integer itemDelete = arr.get(arr.size() - 1);
        arr.remove(arr.size() - 1);
        
        if (itemDelete.equals(arrMin.get(arrMin.size() - 1))) {
            arrMin.remove(arrMin.size() - 1);
        }
    }
    
    public int top() {
        return arr.get(arr.size() - 1);
    }
    
    public int getMin() {
        return arrMin.get(arrMin.size() - 1);
    }
}
