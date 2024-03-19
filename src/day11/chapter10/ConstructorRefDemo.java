package day11.chapter10;

public class ConstructorRefDemo {
  public static void main(String[] args) {
    NewArray<Integer> i ;
    //i = x -> new Integer[x];
    i = Integer[]::new;
    Integer[] array = i.getArray(3);

  }
}

@FunctionalInterface
interface NewArray<T> {
  T[] getArray(int size);
}