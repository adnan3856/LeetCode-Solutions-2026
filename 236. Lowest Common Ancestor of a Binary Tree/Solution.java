/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // BASE CASE:
        // If we hit a null node, or if we find either p or q, 
        // return the current node back up to the caller.
        if (root == null || root == p || root == q)
            return root;
        
        // RECURSIVE STEP:
        // Look for p and q in the left and right subtrees.
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        // COMBINE STEP (The "Bubbling Up" Logic):
        
        // 1. If the left search returned null, it means neither p nor q 
        //    were found in the left subtree. Return whatever the right side found.
        if (left == null)
            return right;
        
        // 2. If the right search returned null, it means p/q weren't 
        //    found on the right. Return whatever the left side found.
        else if (right == null)
            return left;
        
        // 3. If BOTH left and right are non-null, it means one node (p or q) 
        //    was found in the left subtree and the other in the right.
        //    Therefore, the current 'root' is the Lowest Common Ancestor.
        else
            return root;
    }
}
