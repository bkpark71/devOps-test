package day15.chapter13;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {
  public static void main(String[] args) {
    Runnable task = () -> {
      for (int i = 0; i < 5; i++) {
        System.out.println("good bye");
        try {
          Thread.sleep(100);
        } catch (InterruptedException e) {
          throw new RuntimeException(e);
        }
      }
    };

    ExecutorService thPool = Executors.newCachedThreadPool();
    thPool.execute(task);

    for (int i = 0; i < 5; i++) {
      System.out.println("hello");
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
   thPool.shutdown();
  }
}
