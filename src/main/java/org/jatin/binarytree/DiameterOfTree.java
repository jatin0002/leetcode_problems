package org.jatin.binarytree;

public class DiameterOfTree {

    // The diameter of a binary tree is the length of the longest path between any two nodes in a tree.
    // This path may or may not pass through the root.
    //The length of a path between two nodes is represented by the number of edges between them.


    private int diameter;

    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter;
    }

    private int height(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        int dia = leftHeight + rightHeight;
        diameter = Math.max(diameter , dia);

        return Math.max(leftHeight, rightHeight) +1;
    }
}
