package org.jatin.binarytree;

public class MergeBinaryTree {

    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return null;
        }
        if (root2 == null) {
            return root1;
        }
        if (root1 == null) {
            return root2;
        }

        TreeNode sumRoot = new TreeNode(root1.val + root2.val);
        sumRoot.left = mergeTrees(root1.left, root2.left);
        sumRoot.right = mergeTrees(root1.right, root2.right);
        return sumRoot;
    }

}
