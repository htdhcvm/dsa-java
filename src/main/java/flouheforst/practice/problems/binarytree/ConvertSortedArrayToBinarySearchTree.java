package flouheforst.practice.problems.binarytree;

public class ConvertSortedArrayToBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        
        return sortedArrayToBinaryTree(nums, 0, nums.length - 1);
    }
    
    public TreeNode sortedArrayToBinaryTree(
            int[] nums,
            int left,
            int right
    ) {
        if (left > right)
            return null;
        int middle = left + (right - left) / 2;
        int item = nums[middle];
        
        TreeNode node = new TreeNode(item);
        
        node.left = sortedArrayToBinaryTree(nums, left, middle - 1);
        node.right = sortedArrayToBinaryTree(nums, middle + 1, right);
        
        return node;
    }
}
