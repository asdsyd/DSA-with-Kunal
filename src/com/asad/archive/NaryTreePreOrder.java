package com.asad.archive;

/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
// https://leetcode.com/problems/n-ary-tree-preorder-traversal/
class Solution {
    public List<Integer> traverse(Node root,List<Integer> b){
        if(root==null){
            return null;
        }
        b.add(root.val);
        for(Node i:root.children){
            traverse(i,b);
        }
        return b;
    }
    public List<Integer> preorder(Node root) {
        if(root==null){
            List<Integer> v = new ArrayList<>();
            return v;
        }
        List<Integer> c = traverse(root,new ArrayList<>());
        System.out.println(c);
        return c;
    }
}
