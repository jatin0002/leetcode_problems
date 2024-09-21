package org.jatin.binarytree;

import java.util.*;

public class ZigZagLevelOrderTraversal {
    //     Zig Zag Level Order Traversal
//                          1
//                  2               3
//              4      5        6       7
//           8     9        10    11
//
//        Resultant Array [ [1],[3,2][4,5,6,7],[11,10,9,8] ]
//
//    Normal Order (left to Right)
//    -> Remove from front
//    -> Add in Back
//    Revers Order (right to left)
//    -> Remove from back
//    -> Add in front

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Deque<TreeNode> queue = new LinkedList<>();
        queue.offerLast(root);
        boolean isReverse = false;

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> currentList = new ArrayList<>();
            for (int i = 0; i < levelSize; i++) {
                if (!isReverse) {
                    TreeNode currentNode = queue.pollFirst();
                    currentList.add(currentNode.val);

                    if (currentNode.left != null)
                        queue.offerLast(currentNode.left);
                    if (currentNode.right != null)
                        queue.offerLast(currentNode.right);

                } else {
                    TreeNode currentNode = queue.pollLast();
                    currentList.add(currentNode.val);

                    if (currentNode.right != null)
                        queue.offerFirst(currentNode.right);
                    if (currentNode.left != null)
                        queue.offerFirst(currentNode.left);
                }
            }
            isReverse = !isReverse;
            result.add(currentList);
        }

        return result;
    }
}
