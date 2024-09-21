package org.jatin.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {

    // have to use queue data structure
    // ALGO
    // first we have to add root node in queue then
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int currentSize = queue.size();
            List<Integer> currentList = new ArrayList<>(currentSize);

            for (int i = 0; i < currentSize; i++) {
                TreeNode currentNode = queue.poll();
                currentList.add(currentNode.val);

                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }
            result.add(currentList);
        }

        return result;
    }
}
