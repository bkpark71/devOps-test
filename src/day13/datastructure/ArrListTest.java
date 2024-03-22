package day13.datastructure;

import java.util.ArrayList;

public class ArrListTest {
  public static void main(String[] args) {
    ArrayList<Integer> al = new ArrayList<>();


    ArrList<Integer> arr = new ArrList<>();
    arr.add(10);
//    System.out.println(arr.size());
    arr.add(20);
//    System.out.println(arr.size());
    arr.add(30);
//    System.out.println(arr.size());
    arr.add(40);
//    System.out.println(arr.size());
    arr.add(50);
//    System.out.println(arr.size());
    arr.add(60);
//    System.out.println(arr.size());
    arr.add(70);
    arr.add(80);
    arr.add(90);

//    al.add(10);
//    al.add(20);

    System.out.println(arr.get(3));

    for (int i = 0; i < 9; i++) {
      System.out.println(arr.removeLast() + "가 삭제됨");
      //System.out.println(arr.size());
    }
  }
}
