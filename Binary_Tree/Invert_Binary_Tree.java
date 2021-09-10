Que ->Given the root of a binary tree, invert the tree, and return its root.


class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        invertTree(root.left);
        invertTree(root.right);
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        return root;
    }
 }
