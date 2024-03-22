package day13.datastructure;

import java.util.NoSuchElementException;

public class ListQueue<E> {
  private Node<E> front, rear;
  private int size;

  public ListQueue() {
    front = rear = null;
    size = 0;
  }

  public boolean isEmpty() {
    return size == 0 ;
  }

  public void offer(E newItem) {
    Node<E> newNode = new Node(newItem, null);
    if(size == 0) {
      front = newNode;
    } else {
      rear.setNext(newNode);
    }
    rear = newNode;
    size++;
  }

  public E poll(){
    if(size == 0) {
      throw new NoSuchElementException();
    } else if (size == 1){
      rear = null;
    }
    Node<E> temp = front;
    E retItem = temp.getItem();
    front = temp.getNext();
    temp = null;
    size--;
    return retItem;
  }
}
