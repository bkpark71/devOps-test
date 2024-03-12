package day5.chapter5;

import java.util.ArrayList;

public class ArrayListDemo2 {
  public static void main(String[] args) {
    ArrayList<Integer> arrayList = new ArrayList<>();
    arrayList.add(1);
    System.out.println(arrayList.toArray().length);
    arrayList.add(2);
    System.out.println(arrayList.toArray().length);
    arrayList.add(3);
    System.out.println(arrayList.toArray().length);
    arrayList.add(4);
    System.out.println(arrayList.toArray().length);
    arrayList.add(5);
    System.out.println(arrayList.toArray().length);

    System.out.println("삭제된 아이템" + arrayList.remove(4));
    System.out.println("현재 배열의 길이 " + arrayList.toArray().length);


  }
}
