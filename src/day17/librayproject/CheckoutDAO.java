package day17.librayproject;

import java.sql.*;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class CheckoutDAO {
  private Connection conn;
  public List<Checkout> checkoutList() throws SQLException {
    conn = LibraryDBConnection.getConnection();
    String sql = "select * from checkout;";
    PreparedStatement ps = conn.prepareStatement(sql);
    ResultSet rs = ps.executeQuery();
    List<Checkout> checkoutList = new LinkedList<>();
    Checkout checkout;
    if (rs != null) {
      while (rs.next()) {
        checkout = new Checkout(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4),
            rs.getDate(5),rs.getDate(6),rs.getBoolean(7),rs.getDate(8), rs.getDate(9),
            rs.getString(10),rs.getString(11));
        checkoutList.add(checkout);
      }
    }
    return checkoutList;
  }

  public List<Checkout> checkoutListByBookName(String bookname) throws SQLException {
    conn = LibraryDBConnection.getConnection();
    String sql = "select * from checkout where bookname like ? ;";
    PreparedStatement ps = conn.prepareStatement(sql);
    ps.setString(1,bookname);
    ResultSet rs = ps.executeQuery();
    List<Checkout> checkoutList = new LinkedList<>();
    Checkout checkout;
    if (rs != null) {
      while (rs.next()) {
        checkout = new Checkout(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4),
            rs.getDate(5),rs.getDate(6),rs.getBoolean(7),rs.getDate(8), rs.getDate(9),
            rs.getString(10),rs.getString(11));
        checkoutList.add(checkout);
      }
    }
    return checkoutList;
  }

  public List<Checkout> checkoutListByUserName(String username) throws SQLException {
    conn = LibraryDBConnection.getConnection();
    String sql = "select * from checkout where username like ? ;";
    PreparedStatement ps = conn.prepareStatement(sql);
    ps.setString(1,username);
    ResultSet rs = ps.executeQuery();
    List<Checkout> checkoutList = new LinkedList<>();
    Checkout checkout;
    if (rs != null) {
      while (rs.next()) {
        checkout = new Checkout(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4),
            rs.getDate(5),rs.getDate(6),rs.getBoolean(7),rs.getDate(8), rs.getDate(9),
              rs.getString(10),rs.getString(11));
        checkoutList.add(checkout);
      }
    }
    return checkoutList;
  }

  public List<Checkout> checkoutListByUserId(int userId) throws SQLException {
    conn = LibraryDBConnection.getConnection();
    String sql = "select * from checkout where user_id = ? ;";
    PreparedStatement ps = conn.prepareStatement(sql);
    ps.setInt(1,userId);
    ResultSet rs = ps.executeQuery();
    List<Checkout> checkoutList = new LinkedList<>();
    Checkout checkout;
    if (rs != null) {
      while (rs.next()) {
        checkout = new Checkout(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4),
            rs.getDate(5),rs.getDate(6),rs.getBoolean(7),rs.getDate(8), rs.getDate(9),
            rs.getString(10),rs.getString(11));
        checkoutList.add(checkout);
      }
    }
    return checkoutList;
  }

  public boolean checkoutCheck(int bookid) throws SQLException{
    // 대출가능 상태인 도서 확인
    conn = LibraryDBConnection.getConnection();
    String sql = "select * from books where id = ? and status = '대출가능' ; ";
    PreparedStatement ps = conn.prepareStatement(sql);
    ps.setInt(1,bookid);
    ResultSet rs = ps.executeQuery();
    Checkout checkout;
    if (rs != null && rs.next()) {
      return true;  // 대출 가능
    } else {
      return false; // 대출 불가
    }
  }

  public void checkoutProcess(Book book, User user) throws SQLException {
    conn = LibraryDBConnection.getConnection();
    LocalDate today = LocalDate.now();
    LocalDate returnDate = today.plusDays(14);
    Date sqldate = Date.valueOf(LocalDate.now());

    String sql = "insert into checkout (lib_id, book_id, user_id, checkout_date, tobereturn_date, username, bookname) " +
        "values (?,?,?,?,?,?,?) ; " ;
    PreparedStatement ps = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
    ps.setInt(1, user.getLibId());
    ps.setInt(2, book.getId());
    ps.setInt(3, user.getId());
    ps.setDate(4, Date.valueOf(today));
    ps.setDate(5, Date.valueOf(returnDate));
    ps.setString(6, user.getUsername());
    ps.setString(7, book.getBookname());

    if (ps.executeUpdate() == 1) {
      // 책의 update : 대출중으로 업데이트
      BookDAO bookDAO = new BookDAO();
      bookDAO.bookUpdate(book, "대출중");
      System.out.println("대출 처리 완료");
    }
  }
  public Checkout checkoutInfo(Checkout checkout) throws SQLException {

    return null;
  }
}
