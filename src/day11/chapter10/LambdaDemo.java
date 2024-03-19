package day11.chapter10;

public class LambdaDemo {
  public static void main(String[] args) {
//    Object obj = new Object() {
//      int max(int a, int b) {
//        return a > b ? a : b ;
//      }
//    };
//
//    obj.max(10,5);
    Myfunction f = new Myfunction() {
      @Override
      public int min(int a, int b) {
        return a < b ? a : b ;
      }
    };

    System.out.println(f.min(10,7));

    Myfunction f1 = (a, b) -> a < b ? a : b ;
    System.out.println(f1.min(4,5));

    NameClass n = new NameClass();
    System.out.println(n.max(10, 5));
    System.out.println(n.max(3,7));
  }
}

@FunctionalInterface
interface Myfunction {
//  public abstract int max(int a, int b);
  public abstract int min(int a, int b);
}

/*class Anonymous implements Myfunction {

  @Override
  public int max(int a, int b) {
    return 0;
  }
}*/
