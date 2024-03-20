package day12.chapter11;

import java.util.Stack;

public class StackDemo {
  public static void main(String[] args) {
    Stack<String> s1 = new Stack<>();

    System.out.println(s1.empty());

    s1.push("apple");
    System.out.println(s1.search("apple"));
    s1.push("banana");
    System.out.println(s1.search("apple"));
    s1.push("cherry");
    System.out.println(s1.search("apple"));

    while(!s1.empty()) {
      System.out.println(s1.pop());
    }
    //s1.peek();
    //s1.pop();

    Stack<Integer> s2 = new Stack<>();

    s2.add(10);
    s2.add(20);
    s2.add(1,30);

    s2.forEach(integer -> System.out.println(integer));

    while(!s2.empty()) {
      System.out.println(s2.pop());
    }

  }
}
