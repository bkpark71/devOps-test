package day17.librayproject;

import java.sql.SQLException;
import java.util.List;

public class LibraryDemo {
  public static void main(String[] args) throws SQLException {
    //bookDAOTest();
    //userDAOTest();
    checkoutDAOTest();
  }

  private static void checkoutDAOTest() throws SQLException {
    System.out.println("전체 대출도서 목록 조회");
    CheckoutDAO checkoutDAO = new CheckoutDAO();
    List<Checkout> checkouts = checkoutDAO.checkoutList();
    //System.out.println(checkouts);
    checkouts.stream().forEach(System.out::println);
    System.out.println("대출도서 목록 조회(by 도서명)");
    checkouts = checkoutDAO.checkoutListByBookName("자바");
    checkouts.stream().forEach(System.out::println);

    System.out.println("대출도서 목록 조회(by 사용자명)");
    checkouts = checkoutDAO.checkoutListByUserName("홍길동");
    checkouts.stream().forEach(System.out::println);

    System.out.println("대출도서 목록 조회(by 사용자id)");
    checkouts = checkoutDAO.checkoutListByUserId(2);
    checkouts.stream().forEach(System.out::println);

    System.out.println("대출가능인 도서에 대해 대출 처리");
    BookDAO bookDAO = new BookDAO();
    UserDAO userDAO = new UserDAO();
    Book book = bookDAO.bookByID(7,1);
    User user = userDAO.userByID(2,1);
    if(book.getStatus().equals("대출가능") && user != null) {  // 탈퇴한 회원은 사용자대장에서 삭제하므로 user가 존재하면 대출가능이라고 준함
      checkoutDAO.checkoutProcess(book, user);
    }
  }

  private static void userDAOTest() throws SQLException {
    System.out.println("전체 사용자 목록 조회");
    UserDAO userDAO = new UserDAO();
    List<User> userlist = userDAO.userlist();
    System.out.println(userlist);
    System.out.println("사용자명으로 사용자 목록 조회");
    List<User> users = userDAO.userlistByName("홍길동");
    System.out.println(users);
    System.out.println("사용자id로 사용자 세부내역 가져오기");
    User user = userDAO.userByID(1, 1);
    System.out.println(user);
    System.out.println("전화번호 중복 테스트 결과 확인");
 //   System.out.println("사용자 생성 테스트");
//    String telno = "1234567";
//    if(userDAO.telnoDuplicateCheck(telno)) {
//      System.out.println("전화번호 중복입니다.");
//    } else {
//      System.out.println("등록가능한 전화번호");
//      user = new User(0,1,"user2","1234567","address1",0,"qwert");
//      System.out.println(userDAO.userCreate(user) + "번 사용자가 등록되었습니다.");
//    }
//    System.out.println("사용자 정보 수정 테스트");
//    UserUpdateDTO userUpdateDTO = new UserUpdateDTO(1,1,"1234567890","    ","");
//    if(userDAO.telnoDuplicateCheck(userUpdateDTO.getTelno())) {
//      System.out.println("전화번호 중복입니다.");
//    } else {
//      System.out.println("수정가능한 전화번호");
//      userDAO.userUpdate(userDAO.userByID(1, 1),userUpdateDTO);
//    }
    System.out.println("회원 탈퇴");
    user = userDAO.userByID(1, 1);
    if(userDAO.userCheck(user)){ // 대출도서 모두 반납한 경우
      userDAO.userDelete(user);
    } else {
      System.out.println("반납하지 않은 대출도서가 있어서 회원탈퇴할 수 없습니다.");
    }
  }

  private static void bookDAOTest() throws SQLException {
    //    System.out.println("전체 책 목록 조회하기");
//    BookDAO bookDAO = new BookDAO();
//    List<Book> books = bookDAO.bookList();
//    System.out.println(books);
//    System.out.println("출판사가 KOSTA 인 책 목록 조회하기");
//    books = bookDAO.bookListByPublisher("KOSTA");
//    System.out.println(books);
//    System.out.println("새로운 내용 추가");
//    // isbn의 길이가 13자리인지 확인
//    if(bookDAO.isbnDuplicateCheck("1234567890128"))
//      System.out.println("ISBN 중복입니다. 번호 확인 후 재입력하세요.");
//    else
//      System.out.println("신규 책 등록 처리");
//      //    Book book = new Book(0,1,"html", "김영광", "가나출판사", "500", "1234567890128", "PURCHASE", "대출가능");
//     //    int i = bookDAO.bookCreate(book);
//    //    System.out.println("id = " + i + " : 책이 추가되었습니다.");
//
//    System.out.println("책 status 수정");
//    Book book = new Book(6,1,"html", "김영광", "가나출판사", "500", "1234567890128", "PURCHASE", "대출가능");
//    bookDAO.bookUpdate(book, "분실");
//    System.out.println("책 폐기");
//    // 대출 여부 확인 - 구현
//    if(bookDAO.bookCheck(book))
//      bookDAO.bookDelete(book);
//    else
//      System.out.println("분실,파손된 도서만 폐기처분할 수 있음. (ex.대출중이거나 대출중인 도서는 폐기처분대상이 아님)");
  }
}
