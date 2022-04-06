package com.assignment02;
import java.util.NoSuchElementException;

public class Stack<T> {
    private Node<T> head;
    private int size;

    public Stack(){
        setHead(null);
        setSize(0);
    }

    public void Push(T element){
        setHead(new Node<T>(element, head));
        setSize(size + 1);
    }

    public T Top(){
        if(IsEmpty()){
            throw new NoSuchElementException("top() not allowed on Empty Stack!");
        }
        return head.getElement();
    }

    public T Pop(){
        if(IsEmpty()){
            throw new NoSuchElementException("pop() not allowed on Empty Stack!");
        }
        Node<T> oldNode = head;
        if(getSize() == 1){
            setHead(null);
        } else {
            setHead(getHead().getPrevious());
        }

        setSize(size - 1);
        return oldNode.getElement();
    }

    public void Clear(){
        while (!IsEmpty()){
            Pop();
        }
    }

    public boolean IsEmpty(){
        return getSize() == 0;
    }

    // Self generated code
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

}
