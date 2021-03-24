package com.trees;

public class Node {
    public int data;
    public Node left;
    public Node right;

    public Node(){};
    public Node(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

}