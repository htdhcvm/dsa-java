package flouheforst.practice.problems.array;


import flouheforst.practice.problems.binarytree.TreeNode;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Stack;

public class TwoSumInputBST {
    
    Set<Integer> s = new HashSet<>();
    
    private void dfsAndFillSet(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        
        stack.add(root);
        
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            s.add(node.val);
            
            if (node.left != null) {
                stack.add(node.left);
            }
            
            if (node.right != null) {
                stack.add(node.right);
            }
        }
    }
    
    
    private boolean isExistSumValues(int k) {
        Iterator<Integer> iter = s.iterator();
        while (iter.hasNext()) {
            Integer value = iter.next();
            iter.remove();
            Integer find = k - value;
            
            if (s.contains(find)) {
                return true;
            }
            
        }
        
        return false;
    }
    
    public boolean findTarget(
            TreeNode root,
            int k
    ) {
        if (root == null) {
            return false;
        }
        dfsAndFillSet(root);
        
        return isExistSumValues(k);
    }
}
