package org.jatin.binarytree;

public class ValidBinarySearchTree {

    public boolean isValidBST(TreeNode root) {
        return helper(root, null, null);
    }

    private boolean helper(TreeNode node, Integer low, Integer high) {
        if (node == null) {
            return true;
        }

        if (low != null && low >= node.val) {
            return false;
        }

        if (high != null && high <= node.val) {
            return false;
        }


        boolean leftTree = helper(node.left, low, node.val);
        boolean rightTree = helper(node.right, node.val, high);

        return leftTree && rightTree;
    }

}
