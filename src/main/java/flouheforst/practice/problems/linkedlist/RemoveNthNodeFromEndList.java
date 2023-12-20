package flouheforst.practice.problems.linkedlist;

import java.util.ArrayList;


public class RemoveNthNodeFromEndList {
    public ListNode removeNthFromEnd(
            ListNode head,
            int n
    ) {
        ArrayList<ListNode> arrayListNodes = new ArrayList<>();
        
        ListNode current = head;
        while (current.next != null) {
            arrayListNodes.add(current);
            current = current.next;
        }
        
        
        int size = arrayListNodes.size();
        
        if (size == 0) {
            return null;
        }
        
        
        if (size == 1) {
            return null;
        }
        int indexToDelete = size - n;
        
        
        if (indexToDelete == 1) {
            ListNode node = arrayListNodes.get(size - indexToDelete - 1);
            node.next = null;
        }
        
        ListNode prevNode = arrayListNodes.get(indexToDelete - 1);
        ListNode nextNode = arrayListNodes.get(indexToDelete + 1);
        
        prevNode.next = nextNode;
        
        return arrayListNodes.get(0);
    }
}
