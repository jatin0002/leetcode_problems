package org.jatin.binarytree;

public class SubtreeOfAnotherTree {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null) {
            return true;
        }

        TreeNode matchedNode = findNode(root, subRoot.val);

        return isSubTreee(root, matchedNode);
    }

    private boolean isSubTreee(TreeNode p, TreeNode q) {

        if ((p != null && q != null) && p.val == q.val) {
            return true;
        }

        boolean l = isSubTreee(p.left, q.left);
        boolean r = isSubTreee(p.right, q.right);

        return (l && r);
    }

    private TreeNode findNode(TreeNode node, int x) {
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

}
