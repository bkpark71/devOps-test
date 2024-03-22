package day13.datastructure;

import java.util.Stack;

public class CompileTest {
  public static void main(String[] args) {
    String[] p = {"{", "(", ")", "}" };
    Stack<String> compile = new Stack<>();
    String c;
    boolean error = true;

    for (String s : p) {
      if(s.equals("{") || s.equals("(")) {
        compile.push(s);
      } else if (s.equals("}") || s.equals(")")) {
        if(!compile.empty()) {
          c = compile.pop();
          if(s.equals("}")) {
            if(!c.equals("{")) {
              System.out.println(") is required !!");
              error = false;
            }
          } else {
            if(!c.equals("(")) {
              System.out.println("} is required !!");
              error = false;
            }
          }
        }
      }
    }
    if(!compile.empty())
      error=false;

    if(error)
      System.out.println("컴파일 성공");
    else
      System.out.println("컴파일 오류");
  }
}
