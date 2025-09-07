/*Lowest Common Ancestor (LCA) in a Binary Tree

You are given a binary tree and two distinct nodes within the tree. Your task is to find the lowest common ancestor (LCA) of these two nodes. The LCA of two nodes p and q is defined as the lowest node in the tree that has both p and q as descendants (where we allow a node to be a descendant of itself).
*/
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class LCA {
    public static TreeNode findLCA(TreeNode rootNode, TreeNode p, TreeNode q) {
        if (rootNode == null) {
            return null;
        }
        if (rootNode == p || rootNode == q) {
            return rootNode;
        }
        TreeNode l = findLCA(rootNode.left, p, q);
        TreeNode r = findLCA(rootNode.right, p, q);
        if (l != null && r != null) {
            return rootNode;
        }
        return l != null ? l : r;
    }

    public static void main(String[] args) {
        TreeNode tree = new TreeNode(3);
        tree.left = new TreeNode(5);
        tree.right = new TreeNode(1);
        tree.left.left = new TreeNode(6);
        tree.left.right = new TreeNode(2);

        TreeNode ans = findLCA(tree, tree.left, tree.right);
        System.out.println("LCA of " + tree.left.val + " and " + tree.right.val + " is " + ans.val);
    }
}
