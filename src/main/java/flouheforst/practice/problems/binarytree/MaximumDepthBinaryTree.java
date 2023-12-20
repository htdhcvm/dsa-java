package flouheforst.practice.problems.binarytree;


class MaximumDepthBinaryTree {
    public int maxDepthRecursive(TreeNode root) {
        if (root == null)
            return 0;
        
        int left = findMaxDepth(root.left, 1);
        int right = findMaxDepth(root.right, 1);
        
        return Math.max(left, right);
    }
    
    public int findMaxDepth(
            TreeNode root,
            int count
    ) {
        
        if (root == null) {
            return count;
        }
        
        count++;
        
        int left = findMaxDepth(root.left, count);
        int right = findMaxDepth(root.right, count);
        
        return Math.max(left, right);
    }
}