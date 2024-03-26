package day15.chapter13;

import java.io.IOException;

public class IOStreamDemo {
  public static void main(String[] args) throws IOException {
    System.out.println("--- 입력 스트림 ---");
    int[] readByte = new int[100];
    int read ;
    int len = 0;
    read = System.in.read();
    while(!(read == '\n')) {
      System.out.printf("%c(%d)", (char)read, read);
      readByte[len++] = read;
      read = System.in.read();
    }

    System.out.println("--- 출력력 스트림 ---");
    for (int i = 0; i < len; i++) {
      System.out.write(readByte[i]);
    }
    System.out.flush();
    System.out.close();
  }
}
