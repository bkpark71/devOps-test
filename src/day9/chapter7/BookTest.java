package day9.chapter7;

import java.util.Arrays;

public class BookTest {
  public static void main(String[] args) {
    Book[] books = {
        new Book(15000),
        new Book(50000),
        new Book(20000)
    };

    System.out.println("정렬전");
    for (Book book : books) {
      System.out.println(book);
    }

    Arrays.sort(books);
    System.out.println("정렬후");
    for (Book book : books) {
      System.out.println(book);
    }
  }
}
