package day6.chapter5;

public class BallArrayDemo {
  public static void main(String[] args) {
    Ball[] balls = new Ball[5];
    for (Ball ball : balls) {
      System.out.println(ball);
    }
    for (int i = 0; i < 2 ; i++) {
      balls[i] = new Ball(10,"red");
    }
    for (Ball ball : balls) {
      System.out.println(ball);
      if (ball != null) {
        ball.print();
      }
    }
  }
}
