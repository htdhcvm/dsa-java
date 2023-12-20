package flouheforst.practice.problems.binarytree;

import java.util.ArrayDeque;
import java.util.Queue;


public class FindCorrespondingNodeBinaryTreeCloneThatTree {
    public final TreeNode getTargetCopy(
            final TreeNode original,
            final TreeNode cloned,
            final TreeNode target
    ) {
        if (original == null) {
            return null;
        }
        
        if (cloned == null) {
            return null;
        }
        
        if (target == null) {
            return null;
        }
        
        Queue<TreeNode> queueNodes = new ArrayDeque<>();
        
        queueNodes.add(cloned);
        
        while (!queueNodes.isEmpty()) {
            TreeNode treeNode = queueNodes.poll();
            
            if (treeNode.val == target.val) {
                return treeNode;
            }
            
            TreeNode treeNodeLeft = treeNode.left;
            TreeNode treeNodeRight = treeNode.right;
            
            if (treeNodeLeft != null) {
                queueNodes.offer(treeNodeLeft);
                
            }
            if (treeNodeRight != null) {
                queueNodes.offer(treeNodeRight);
                
            }
        }
        return null;
    }
    
}
