package day12.chapter11;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
  public static void main(String[] args) {
    Queue<String> q = new LinkedList<>();
    System.out.println(q.size());
    q.offer("apple");
    q.offer("banana");
    q.offer("cherry");

    while(!q.isEmpty()) {
      System.out.println(q.poll());
    }

    try {
      boolean apple = q.add("apple");
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
    System.out.println(q.poll());
    System.out.println(q.poll());
    q.remove();
//    q.remove();
  }
}
