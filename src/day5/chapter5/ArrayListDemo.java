package day5.chapter5;

public class ArrayListDemo {
  public static void main(String[] args) {
    int[] arr = {1,2,3,4};
    int[] newArr = new int[5];

    for (int i = 0; i < arr.length; i++) {
      newArr[i] = arr[i];
    }

    arr = newArr;
    arr[4] = 5;

    int sum=0;
    for (int i : arr) {
      sum+= i;
    }
    System.out.println(sum);
    System.out.println(arr.length);

    // 크기를 5에서 4로 변경하는데 5번째 원소는 삭제
    int remItem = arr[arr.length - 1];
    int[] newArr1 = new int[4];
    for (int i = 0; i < newArr1.length; i++) {
      newArr1[i] = arr[i];
    }

    arr = newArr1  ;
    System.out.println(remItem + "이 삭제되었고, 현재 배열의 길이는 " + arr.length + "입니다.");
  }
}
