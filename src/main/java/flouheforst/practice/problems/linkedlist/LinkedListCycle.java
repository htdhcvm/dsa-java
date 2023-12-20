package flouheforst.practice.problems.linkedlist;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        
        ListNode slow = head;
        ListNode fast = head.next;
        
        while (slow != null && fast != null) {
            if (slow.val == fast.val) {
                return true;
            }
            
            slow = slow.next;
            
            if (fast.next == null) {
                return false;
            }
            fast = fast.next.next;
        }
        
        return false;
    }
    
    public boolean solution2(ListNode head) {
        Set hs = new HashSet();
        
        if (head == null) {
            return false;
        }
        
        ListNode iter = head;
        
        while (iter != null) {
            if (hs.contains(iter)) {
                return true;
            }
            
            hs.add(iter);
            
            iter = iter.next;
        }
        
        return false;
    }
}
