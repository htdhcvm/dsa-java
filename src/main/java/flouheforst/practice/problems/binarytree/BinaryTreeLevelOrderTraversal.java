package flouheforst.practice.problems.binarytree;


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> response = new ArrayList<>();
        
        if (root == null) {
            return response;
        }
        
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        
        
        while (!queue.isEmpty()) {
            List<Integer> subResponse = new ArrayList<>();
            Queue<TreeNode> tmp = new ArrayDeque<>();
            
            while (!queue.isEmpty()) {
                TreeNode item = queue.poll();
                
                TreeNode itemLeft = item.left;
                TreeNode itemRight = item.right;
                
                
                if (itemLeft != null) {
                    tmp.add(itemLeft);
                }
                
                if (itemRight != null) {
                    tmp.add(itemRight);
                }
                subResponse.add(item.val);
            }
            
            response.add(subResponse);
            queue.addAll(tmp);
        }
        
        return response;
    }
}
