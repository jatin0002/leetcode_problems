package org.jatin.binarytree;

public class FlattenTheBinaryTreeToLinkedList {

    // Intiution
    // The node you are currently at, check if it having left child and then find the right most element
    // for it, and do right most element equal to current node.right
    // then convert left child into right child

    public void flatten(TreeNode root) {
        TreeNode current = root;
        while (current != null) {
            if (current.left != null) {
                TreeNode temp = current.left;
                while (temp.right != null) {
                    temp = temp.right;
                }
                temp.right = current.right;
                current.right = current.left;
                current.left = null;
            }
            current = current.right;
        }
        root = current;
    }
}
