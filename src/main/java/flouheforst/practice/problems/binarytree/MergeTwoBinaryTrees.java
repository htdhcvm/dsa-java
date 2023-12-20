package flouheforst.practice.problems.binarytree;

import java.util.ArrayDeque;
import java.util.Deque;


public class MergeTwoBinaryTrees {
    public TreeNode solutionRecursive(
            TreeNode root1,
            TreeNode root2
    ) {
        if (root1 == null && root2 == null)
            return null;
        if (root1 == null) {
            return root2;
        }
        if (root2 == null) {
            return root1;
        }
        
        root1.val = root1.val + root2.val;
        
        root1.left = solutionRecursive(root1.left, root2.left);
        root1.right = solutionRecursive(root1.right, root2.right);
        
        return root1;
    }
    
    public TreeNode solutionIterative(
            TreeNode root1,
            TreeNode root2
    ) {
        if (root1 == null) {
            return root2;
        }
        
        if (root2 == null) {
            return root1;
        }
        
        Deque<TreeNode[]> stack = new ArrayDeque<>();
        stack.push(new TreeNode[]{root1, root2});
        
        while (!stack.isEmpty()) {
            TreeNode[] t = stack.pop();
            if (t[0] == null || t[1] == null) {
                continue;
            }
            
            t[0].val = t[0].val + t[1].val;
            
            if (t[0].left == null) {
                t[0].left = t[1].left;
            } else {
                stack.push(new TreeNode[]{t[0].left, t[1].left});
            }
            
            if (t[0].right == null) {
                t[0].right = t[1].right;
            } else {
                stack.push(new TreeNode[]{t[0].right, t[1].right});
            }
        }
        
        return root1;
    }
    
}

