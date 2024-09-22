package org.jatin.binarytree;

public class IsCousion {

    // x and y are cousion Iff there level is same and there parent are not same
    // (means paraent are different)
    // Intution
    // first we have to find the node x and in tree
    // then have to find level and then have to check they are sibling or not
    public boolean isCousins(TreeNode root, int x, int y) {
        TreeNode xx = findNode(root, x);
        TreeNode yy = findNode(root, y);

        int levelX = level(root, xx, 0);
        int levelY = level(root, yy, 0);

        return ((levelX == levelY) && (!isSibling(root, xx, yy)));
    }

    private boolean isSibling(TreeNode node, TreeNode xx, TreeNode yy) {
        if (node == null) {
            return false;
        }
        return ((node.left == xx && node.right == yy) || (node.left == yy && node.right == xx)
                || isSibling(node.left, xx, yy) || isSibling(node.right, xx, yy)
        );
    }


    TreeNode findNode(TreeNode node, int x) {
        if (node == null) {
            return null;
        }
        if (node.val == x) {
            return node;
        }
        TreeNode n = findNode(node.left, x);
        if (n != null) {
            return n;
        }
        return findNode(node.right, x);
    }

    private int level(TreeNode node, TreeNode x, int lev) {
        if (node == null)
            return 0;

        if (node == x) {
            return lev;
        }

        int l = level(node.left, x, lev + 1);
        if (l != 0) {
            return l;
        }

        return level(node.right, x, lev + 1);
    }

}
