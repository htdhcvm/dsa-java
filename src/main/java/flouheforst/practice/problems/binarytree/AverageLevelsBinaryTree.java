package flouheforst.practice.problems.binarytree;


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

class AverageLevelsBinaryTree {
    public List<Double> averageOfLevels(TreeNode root) {
        if (root == null) {
            return List.of();
        }
        
        if (root.left == null && root.right == null) {
            return List.of((double) root.val);
        }
        Queue<TreeNode> queue = new ArrayDeque<>();
        
        List<Double> response = new ArrayList<>();
        queue.add(root);
        
        while (!queue.isEmpty()) {
            
            Queue<TreeNode> queueTmp = new ArrayDeque<>();
            
            Double sum = 0.0;
            int count = 0;
            
            while (!queue.isEmpty()) {
                TreeNode item = queue.poll();
                
                count++;
                sum += item.val;
                
                if (item.left != null) {
                    queueTmp.add(item.left);
                }
                
                if (item.right != null) {
                    queueTmp.add(item.right);
                }
            }
            
            while (!queueTmp.isEmpty()) {
                queue.add(queueTmp.poll());
            }
            
            response.add(sum / count);
        }
        
        return response;
    }
}