package day13.datastructure;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class MyStack<E> {
  private Node<E> top;
  private int size;
  public MyStack() {
    top=null;
    size=0;
  }
  // 메서드
  public int size(){
    return size;
  }

  public void push(E item) {
    Node<E> newNode = new Node(item, null);
    newNode.setNext(top);
    top = newNode;
    size++;
  }

  public boolean empty() {
    return size==0;
  }

  public E peek(){
    if(empty()) {
      throw new EmptyStackException();
    }
    return top.getItem();
  }
  public E pop() {
    if(size == 0) {
      throw new NoSuchElementException();
    }
    Node<E> temp = top;
    E retItem = temp.getItem();
    top = temp.getNext();
    //temp = null;
    size--;
    return retItem;
  }
}
