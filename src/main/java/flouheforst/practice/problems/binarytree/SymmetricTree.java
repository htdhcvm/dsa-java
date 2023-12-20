package flouheforst.practice.problems.binarytree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        
        Queue<TreeNode> q = new ArrayDeque<>();
        Queue<TreeNode> symmetricQ = new ArrayDeque<>();
        
        q.add(root);
        symmetricQ.add(root);
        
        while (!q.isEmpty()) {
            Queue<TreeNode> newNodesForQ = new ArrayDeque<>();
            Queue<TreeNode> newNodesForSymQ = new ArrayDeque<>();
            List<TreeNode> checkSymmetric = new ArrayList<>();
            
            while (!q.isEmpty() || !symmetricQ.isEmpty()) {
                TreeNode item = q.poll();
                TreeNode itemSymmetric = symmetricQ.poll();
                
                if (item != null) {
                    TreeNode itemLeft = item.left;
                    TreeNode itemRight = item.right;
                    
                    if (itemLeft != null) {
                        newNodesForQ.add(itemLeft);
                    }
                    if (itemRight != null) {
                        newNodesForQ.add(itemRight);
                    }
                }
                
                
                if (itemSymmetric != null) {
                    TreeNode itemSummetricLeft = itemSymmetric.left;
                    TreeNode itemSummetricRight = itemSymmetric.right;
                    
                    if (itemSummetricLeft == null) {
                        newNodesForSymQ.add(new TreeNode(Integer.MIN_VALUE));
                    }
                    
                    if (itemSummetricLeft != null) {
                        newNodesForSymQ.add(itemSummetricLeft);
                    }
                    
                    if (itemSummetricRight == null) {
                        newNodesForSymQ.add(new TreeNode(Integer.MIN_VALUE));
                    }
                    
                    if (itemSummetricRight != null) {
                        newNodesForSymQ.add(itemSummetricRight);
                    }
                    
                }
                
                checkSymmetric.add(itemSymmetric);
            }
            
            
            boolean isSymmetricList = isSymmetricList(checkSymmetric);
            if (!isSymmetricList)
                return false;
            
            q.addAll(newNodesForQ);
            symmetricQ.addAll(newNodesForSymQ);
        }
        
        return true;
    }
    
    
    private boolean isSymmetricList(List<TreeNode> list) {
        if (list.isEmpty() || list.size() == 1) {
            return true;
        }
        
        
        int firstIterator = 0;
        int lastIterator = list.size() - 1;
        
        
        while (firstIterator < lastIterator) {
            TreeNode first = list.get(firstIterator);
            TreeNode last = list.get(lastIterator);
            
            if (first == null && last != null) {
                return false;
            }
            
            if (last == null && first != null) {
                return false;
            }
            
            if (last != null && first != null && first.val != last.val) {
                return false;
            }
            firstIterator++;
            lastIterator--;
        }
        
        return true;
    }
}