package day15.chapter18;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {
  public static void main(String[] args) {
    try
      (ServerSocket serverSocket = new ServerSocket(5000);
      Socket socket = serverSocket.accept();
      InputStream is = socket.getInputStream();
      ObjectInputStream ois = new ObjectInputStream(is);){
      String s = (String) ois.readObject();
      System.out.println("받은 문자열 : " + s);
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}
