//package com.asad.archive;
//
///**
// * Definition for a binary tree node.
// * public class TreeNode {
// *     int val;
// *     TreeNode left;
// *     TreeNode right;
// *     TreeNode() {}
// *     TreeNode(int val) { this.val = val; }
// *     TreeNode(int val, TreeNode left, TreeNode right) {
// *         this.val = val;
// *         this.left = left;
// *         this.right = right;
// *     }
// * }
// */
//
// //https://leetcode.com/problems/binary-tree-postorder-traversal/
//class Solution {
//    List<Integer> a = new ArrayList<>();
//    public List<Integer> postorderTraversal(TreeNode root) {
//        if(root==null){
//            return a;
//        }
//        postorderTraversal(root.left);
//         postorderTraversal(root.right);
//        a.add(root.val);
//        return a;
//    }
//}
