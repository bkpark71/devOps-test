package day13.datastructure;

import java.util.Stack;

public class StackTest {
  public static void main(String[] args) {
    MyStack<Integer> myStack = new MyStack();
    //myStack.peek();

    myStack.push(10);
    myStack.push(20);
    myStack.push(30);

    System.out.println(myStack.peek());

    while(!myStack.empty()) {
      System.out.println(myStack.pop());
    }

    Stack<Integer> stack = new Stack<>();
    stack.peek();

    //return;
  }
}
