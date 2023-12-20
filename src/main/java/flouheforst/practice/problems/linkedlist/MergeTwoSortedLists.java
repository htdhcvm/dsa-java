package flouheforst.practice.problems.linkedlist;


public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(
            ListNode list1,
            ListNode list2
    ) {
        ListNode firstIter = list1;
        ListNode secondIter = list2;
        
        ListNode listIter = new ListNode();
        ListNode response = listIter;
        
        while (firstIter != null && secondIter != null) {
            if (firstIter.val < secondIter.val) {
                listIter.next = firstIter;
                
                firstIter = firstIter.next;
                listIter = listIter.next;
            } else {
                listIter.next = secondIter;
                
                secondIter = secondIter.next;
                listIter = listIter.next;
            }
        }
        
        while (firstIter != null) {
            listIter.next = firstIter;
            
            firstIter = firstIter.next;
            listIter = listIter.next;
        }
        
        while (secondIter != null) {
            listIter.next = secondIter;
            
            secondIter = secondIter.next;
            listIter = listIter.next;
        }
        
        
        return response.next;
    }
}
