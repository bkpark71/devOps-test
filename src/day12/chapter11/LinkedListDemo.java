package day12.chapter11;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo {
  public static void main(String[] args) {
    LinkedList<Integer> ll = new LinkedList<>();
    ll.add(10);
    ll.add(20);

    System.out.println(ll.remove(0));
    System.out.println(ll.size());
    System.out.println(ll.remove(0));
    System.out.println(ll.size());

    long startTime = System.nanoTime();
    for (int i = 0; i < 1000000 ; i++) {
      ll.add(i);
    }
    long endTime = System.nanoTime();
    long duration = endTime - startTime;
    System.out.println("linked list 에 추가는 " + duration + " 만큼 걸림");

    ArrayList<Integer> al = new ArrayList<>();
    startTime = System.nanoTime();
    for (int i = 0; i < 1000000 ; i++) {
      al.add(i);
    }
    endTime = System.nanoTime();
    duration = endTime - startTime;
    System.out.println("array list 에 추가는 " + duration + " 만큼 걸림");
  }
}
