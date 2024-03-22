package day13.datastructure;

import java.util.NoSuchElementException;

public class SLinkedList<E> {
  private Node<E> head;
  private Node<E> tail;
  private int size;

  public SLinkedList() {
    head = null;
    tail = null;
    size = 0;
  }

  // 탐색, 삽입, 삭제 연산 메서드
  public int size() {
    return size;
  }

  public E get(int index){
    return getNode(index).getItem();
  }

  private Node<E> getNode(int index){
    Node<E> x = head;
    for (int i = 0; i < index; i++) {
      x = x.getNext();
    }
    return x;
  }

  public void addFirst(E newItem) {
    Node<E> newNode = new Node(newItem, null);
    if(size == 0) {
      tail = newNode;
    } else {
      newNode.setNext(head);
    }
    head = newNode;
    size++;
  }

  public void addLast(E newItem) {
    Node<E> newNode = new Node(newItem, null);
    if(size == 0) {
      head = newNode;
    } else {
      tail.setNext(newNode);
    }
    tail = newNode;
    size++;
  }
  // 삭제
  public E remove() {
    if(size == 0) {
      throw new NoSuchElementException();
      //tail = null;
    } else if (size == 1){
      tail = null;
    }
    Node<E> temp = head;
    E retItem = temp.getItem();
    head = temp.getNext();
    temp = null;
    size--;
    return retItem;
  }
  public E remove(int index) {
    if(size == 0) { //
      throw new IndexOutOfBoundsException();
    }
    if(index == 0) {
      return remove();
    }
    Node<E> prevNode = getNode(index - 1);
    Node<E> temp = prevNode.getNext();

    E retItem = temp.getItem();
    if(tail == temp) {
      tail = prevNode;
    }
    prevNode.setNext(temp.getNext());
    temp = null;
    size--;
    return retItem;
  }
}

class Node<E>{
  private E item;
  private Node<E> next;
  public Node(E item, Node<E> node){
    this.item = item;
    this.next = node;
  }

  public E getItem() {
    return item;
  }

  public Node<E> getNext() {
    return next;
  }

  public void setItem(E item) {
    this.item = item;
  }

  public void setNext(Node<E> next) {
    this.next = next;
  }
}
