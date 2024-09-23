package org.jatin.binarytree;

public class LowetCommonAncesterOfBST {

    // We're checking in Binary Search Tree
    // if p.val and q.val is smaller than root.val then no need to explore right side
    // if p.val and q.val is greater than root.val then no need to explore left side

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // if p.val and q.val is smaller than root.val then no need to explore right side
        if (p.val < root.val && q.val < root.val) {
            return lowestCommonAncestor(root.left, p, q);
        }
        // if p.val and q.val is greater than root.val then no need to explore left side
        else if (p.val > root.val && q.val > root.val) {
            return lowestCommonAncestor(root.right, p, q);
        } else {
            // If one node is smaller and the other is greater,
            // or if one of them matches the current node,
            // then the current node is the lowest common ancestor
            return root;
        }
    }
}
