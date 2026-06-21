/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    int best = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return best;
    }

    public int height(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int leftLongest = height(node.left);
        int rightLongest = height(node.right);

        if(leftLongest + rightLongest > best) {
            best = leftLongest + rightLongest;
        }
        if(leftLongest > rightLongest) {
            return leftLongest + 1;
        }
        return rightLongest + 1;
    }
}
