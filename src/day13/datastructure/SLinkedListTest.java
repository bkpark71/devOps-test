package day13.datastructure;

import java.util.LinkedList;

public class SLinkedListTest {
  public static void main(String[] args) {
    SLinkedList<Integer> s1 = new SLinkedList<>();
    System.out.println(s1.size());
/*    s1.addFirst(10);
    s1.addFirst(20);
    s1.addFirst(30);
    System.out.println(s1.size());
    for (int i = 0; i < s1.size(); i++) {
      System.out.println(s1.get(i));
    }*/
    //s1.remove();

    s1.addLast(10);
    s1.addLast(20);
    s1.addLast(30);
    System.out.println(s1.size());
    for (int i = 0; i < s1.size(); i++) {
      System.out.println(s1.get(i));
    }
//    System.out.println(s1.remove() + " 가 삭제됨");
//    System.out.println(s1.size());
//    for (int i = 0; i < s1.size(); i++) {
//      System.out.println(s1.get(i));
//    }
//    System.out.println(s1.remove(1) +"가 삭제됨");
//    for (int i = 0; i < s1.size(); i++) {
//      System.out.println(s1.get(i));
//    }
    System.out.println(s1.remove(1) +"가 삭제됨");
    for (int i = 0; i < s1.size(); i++) {
      System.out.println(s1.get(i));
    }

    LinkedList<Integer> ll = new LinkedList<>();
    System.out.println(ll.size());
    ll.remove(0);
    ll.remove();
    ll.add(10);
    ll.add(20);
    ll.add(30);
    ll.add(40);


    System.out.println(ll.size());
    System.out.println(ll);

    System.out.println(ll.get(0));

    System.out.println(ll.remove() +"가 삭제됨");
  }
}
