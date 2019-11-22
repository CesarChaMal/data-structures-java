package com.balazsholczer.linkedlist;

public class Node2<T extends Comparable<T>> {

    private T data;
    private Node2<T> previousNode;
    private Node2<T> nextNode;

    public Node2(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public Node2<T> getPreviousNode() {
        return previousNode;
    }

    public Node2<T> getNextNode() {
        return nextNode;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setPreviousNode(Node2<T> previousNode) {
        this.previousNode = previousNode;
    }

    public void setNextNode(Node2<T> nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return this.data.toString();
    }
}
