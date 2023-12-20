package flouheforst.practice.problems.linkedlist;


import java.util.ArrayList;

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        ListNode iter = head;
        ArrayList<Integer> ar = new ArrayList<>();
        
        while (iter != null) {
            ar.add(iter.val);
            iter = iter.next;
        }
        
        int first = 0;
        int second = ar.size() - 1;
        
        while (first < second) {
            
            if (ar.get(first) != ar.get(second)) {
                return false;
            }
            first++;
            second--;
        }
        
        return true;
    }
}
