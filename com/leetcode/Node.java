package com.leetcode;

public class Node {
    int Data;
    Node left;
    Node right;

    Node(){};

    public Node(int data, Node left, Node right) {
        Data = data;
        this.left = left;
        this.right = right;
    }

    public int getData() {
        return Data;
    }

    public void setData(int data) {
        Data = data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    
    
}
