package flouheforst.practice.problems.binarytree;

public class ValidateBinarySearchTree {
    private final Long MAX_MAX = (long) (Integer.MAX_VALUE) + 1;
    private final Long MAX_MIN = (long) (Integer.MIN_VALUE) - 1;
    
    public boolean isValidBST(TreeNode root) {
        if (root == null)
            return true;
        if (root.left == null && root.right == null)
            return true;
        
        if (root.left == null && root.right != null && root.val >= root.right.val)
            return false;
        if (root.left != null && root.right == null && root.val <= root.left.val)
            return false;
        
        if (root.left != null && root.right != null && root.left.val == root.right.val)
            return false;
        
        
        boolean isValidLeft = isValid(root.left, MAX_MIN, (long) root.val);
        boolean isValidRight = isValid(root.right, (long) root.val, MAX_MAX);
        
        return isValidLeft && isValidRight;
    }
    
    public boolean isValid(
            TreeNode root,
            Long greaterThen,
            Long lessThen
    ) {
        if (root == null)
            return true;
        
        if (root.val <= greaterThen || root.val >= lessThen) {
            return false;
        }
        
        boolean isValidLeft = isValid(root.left, greaterThen, (long) root.val);
        if (!isValidLeft) {
            return false;
        }
        boolean isValidRight = isValid(root.right, (long) root.val, lessThen);
        
        return isValidRight;
    }
}
