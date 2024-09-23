package org.jatin.binarytree;

public class LowestCommonAncesterInBT {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return root;
        }

        if (root == p || root == q) {
            return root;
        }

        TreeNode lNode = lowestCommonAncestor(root.left, p, q);
        TreeNode rNode = lowestCommonAncestor(root.right, p, q);

        if (lNode != null && rNode != q) {
            return root;
        }

        if (lNode != null) {
            return lNode;
        }
        return rNode;
    }

}
