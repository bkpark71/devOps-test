package day15.chapter13;

import java.io.*;

public class CopyFileDemo1 {
  public static void main(String[] args) {
    String input = "C:\\Temp\\org.txt";
    String output = "C:\\Temp\\target.txt";
    int read;
    try {
      FileReader fr = new FileReader(input);
      FileWriter fw = new FileWriter(output, true);
      while((read = fr.read()) != -1){
        fw.write(read);
      }
    } catch (FileNotFoundException e) {
      System.out.println("해당 파일을 찾을 수 없습니다.");
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
