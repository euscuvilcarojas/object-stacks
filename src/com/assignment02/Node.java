package com.assignment02;

public class Node<T> {
    private T element;
    private Node<T> previousNode;

    //Constructors
    public Node(){
        setElement(null);
        setPreviousNode(null);
    }

    public Node(T element){
        setElement(element);
    }

    public Node(T element, Node<T> previousNode){
        setElement(element);
        setPrevious(previousNode);
    }

    //Method
    public T getElement(){
        return this.element;
    }

    public Node<T> getPrevious(){
        return this.getPreviousNode();
    }


    // Self generated code

    public void setElement(T element){
        this.element = element;
    }

    public void setPrevious(Node<T> prev){
        this.setPreviousNode(prev);
    }

    public Node<T> getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(Node<T> previousNode) {
        this.previousNode = previousNode;
    }
}
