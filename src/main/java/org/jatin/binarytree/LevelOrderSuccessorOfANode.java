package org.jatin.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderSuccessorOfANode {

    public TreeNode levelOrderSuccessor(TreeNode root, int target) {
        if(root == null){
            return null;
        }

        if (root.val == target) {
            return root;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int levelSize = queue.size();
            for (int i = 0; i <levelSize; i++) {
                TreeNode currentNode = queue.poll();
                if(currentNode.val == target){
                    return queue.peek();
                }

                if(currentNode.left != null)
                    queue.offer(currentNode.left);

                if(currentNode.right != null)
                    queue.offer(currentNode.right);
            }
        }

        return null;
    }

}
