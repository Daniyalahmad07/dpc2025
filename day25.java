/*Check if a Binary Tree is a Binary Search Tree (BST)

You are given the root of a binary tree. Your task is to determine whether the tree is a valid Binary Search Tree (BST). A binary search tree is defined as a tree where:
Every node’s left subtree contains only nodes with values less than the node’s value.
Every node’s right subtree contains only nodes with values greater than the node’s value.
Both the left and right subtrees must also be binary search trees.
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

public class BST {

    private boolean helper(TreeNode root, long min , long max){
        if(root == null){
            return true;
        }
        if(root.val <= min || root.val >= max){
            return false;
        }
        return helper(root.left, min, root.val) && helper(root.right, root.val, max);
    }

    public boolean isValidBST(TreeNode root) {
        return helper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public static void main(String[] args) {
        BST bst = new BST();

        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);

        System.out.println(bst.isValidBST(root));
    }
}
