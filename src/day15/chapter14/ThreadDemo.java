package day15.chapter14;

public class ThreadDemo {
  public static void main(String[] args) {
    WorkerThread t1 = new WorkerThread();
    t1.start();
    WorkerThread t2 = new WorkerThread();
    t2.start();
    WorkerThread t3 = new WorkerThread();
    t3.start();
    WorkerThread t4 = new WorkerThread();
    t4.start();
    WorkerThread t5 = new WorkerThread();
    t5.start();

    for (int i = 0; i < 5; i++) {
      System.out.println("Hello");
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }


  }


}

class WorkerThread extends Thread {
  @Override
  public void run() {
    for (int i = 0; i < 5; i++) {
      System.out.println("Good bye");
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
  }
}
