package day15.chapter14;

public class NoThreadDemo {
  public static void main(String[] args){
    Thread th1 = new Thread(new Runnable() {
      @Override
      public void run() {
        for (int i = 0; i < 5; i++) {
          System.out.println("안녕");
          try {
            Thread.sleep(300);
          } catch (InterruptedException e) {
            throw new RuntimeException(e);
          }
        }
      }
    });
    th1.start();

    for (int i = 0; i < 5; i++) {
      System.out.println("잘가");
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
  }
}
