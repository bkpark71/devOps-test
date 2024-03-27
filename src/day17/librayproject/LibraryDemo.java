package day17.librayproject;

import java.sql.SQLException;
import java.util.List;

public class LibraryDemo {
  public static void main(String[] args) throws SQLException {
    System.out.println("전체 책 목록 조회하기");
    BookDAO bookDAO = new BookDAO();
    List<Book> books = bookDAO.bookList();
    System.out.println(books);
    System.out.println("출판사가 KOSTA 인 책 목록 조회하기");
    books = bookDAO.bookListByPublisher("KOSTA");
    System.out.println(books);
    System.out.println("새로운 내용 추가");
//    Book book = new Book(0,1,"html", "김영광", "가나출판사", "500", "1234567890128", "PURCHASE", "대출가능");
//    int i = bookDAO.bookCreate(book);
//    System.out.println("id = " + i + " : 책이 추가되었습니다.");
    System.out.println("책 status 수정");
    Book book = new Book(6,1,"html", "김영광", "가나출판사", "500", "1234567890128", "PURCHASE", "대출가능");
    bookDAO.bookUpdate(book, "분실");
    System.out.println("책 폐기");
    // 대출 여부 확인 - 구현
    if(bookDAO.bookCheck(book))
      bookDAO.bookDelete(book);
    else
      System.out.println("분실,파손된 도서만 폐기처분할 수 있음. (ex.대출중이거나 대출중인 도서는 폐기처분대상이 아님)");
  }
}
