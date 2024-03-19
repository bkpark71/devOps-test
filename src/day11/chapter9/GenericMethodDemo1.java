package day11.chapter9;

import day10.chapter8.Beer;
import day10.chapter8.Beverage;

public class GenericMethodDemo1 {
  static class Utils {
    public static <T extends Beverage> void showArray(T[] a) {
      for (T i : a) {
        System.out.println(i);
      }
    }

    public static <T> T getLast(T[] a){
      return a[a.length - 1];
    }

  }

  public static void main(String[] args) {
    Integer[] ia = {1,2,3,4,5};
    Double[] da =  {1.1, 2.1, 3.1};
    Character[] ca = {'a','b','c'};
    String[] sa = {"hello", "world"};
    Beer[] ba = {new Beer()};

    Utils.showArray(ba);

//    Utils.showArray(ia);
//    Utils.showArray(da);
    //Utils.showArray(ca);
    //Utils.showArray(sa);
    System.out.println(Utils.getLast(ca));
  }
}
//    public static void showArray(String[] a) {
//      for (String s : a) {
//        System.out.println(s);
//      }
//    }
//
//    public static void showArray(char[] a) {
//      for (char c : a) {
//        System.out.println();
//      }
//    }

