package day13.datastructure;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
  public static void main(String[] args) {
    Queue<String> q = new LinkedList<>();
    q.offer("A");
    q.add("B");
    q.add("C");

    while(!q.isEmpty()) {
      System.out.println(q.poll());
    }

    ListQueue<Integer> queue = new ListQueue<>();
    //eue.poll();
    queue.offer(10);
    queue.offer(20);
    queue.offer(30);

    while(!queue.isEmpty()){
      System.out.println(queue.poll());
    }
  }
}
