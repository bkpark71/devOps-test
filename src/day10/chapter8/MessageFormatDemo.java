package day10.chapter8;

import java.text.MessageFormat;

public class MessageFormatDemo {
  public static void main(String[] args) {
    String java = "java";
    int version = 17;

    System.out.println(MessageFormat.format("ver : {1}, lang : {0} , ver : {1}",
        java, version));
    System.out.println(
        MessageFormat.format("ver : {1}, lang : {0} , ver : {1}",
        new Object[]{java,version,333333}));
  }
}
