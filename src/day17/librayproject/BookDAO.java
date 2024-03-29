package day17.librayproject;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class BookDAO {
  private Connection conn;

  // CRUD
  public List<Book> bookList() throws SQLException {
    conn = LibraryDBConnection.getConnection();
    String sql = "select id, lib_id, bookname, writername, publisher from books;";
    PreparedStatement ps = conn.prepareStatement(sql);
    ResultSet rs = ps.executeQuery();
    List<Book> bookList = new LinkedList<>();
    Book book;
    if (rs != null) {
      while (rs.next()) {
        book = new Book(rs.getInt(1), rs.getInt(2),
            rs.getString(3), rs.getString(4),
            rs.getString(5), "", "", "", "");
        bookList.add(book);
      }
    }
    return bookList;
  }

  public Book bookByID(int bookid, int libId) throws SQLException {
    conn = LibraryDBConnection.getConnection();
    String sql = "select * from books where id = ? and lib_id = ?;";
    PreparedStatement ps = conn.prepareStatement(sql);
    ps.setInt(1, bookid);
    ps.setInt(2, libId);
    ResultSet rs = ps.executeQuery();
    Book book;
    if (rs != null && rs.next()) {
      book = new Book(
          rs.getInt(1), rs.getInt(2), rs.getString(3),
          rs.getString(4), rs.getString(5), rs.getString(6),
          rs.getString(7), rs.getString(8), rs.getString(9));
      return book;
    }
    return null;
  }

  public List<Book> bookListByName(String bookname) throws SQLException {
    conn = LibraryDBConnection.getConnection();
    String sql = "select id, lib_id, bookname, writername, publisher from books where bookname like ?;";
    PreparedStatement ps = conn.prepareStatement(sql);
    ps.setString(1, bookname);
    ResultSet rs = ps.executeQuery();
    List<Book> bookList = new LinkedList<>();
    Book book;
    if (rs != null) {
      while (rs.next()) {
        book = new Book(rs.getInt(1), rs.getInt(2),
            rs.getString(3), rs.getString(4),
            rs.getString(5), "", "", "", "");
        bookList.add(book);
      }
    }
    return bookList;
  }

  public List<Book> bookListByWriter(String writername) throws SQLException {
    conn = LibraryDBConnection.getConnection();
    String sql = "select id, lib_id, bookname, writername, publisher from books where writerame like ?;";
    PreparedStatement ps = conn.prepareStatement(sql);
    ps.setString(1, writername);
    ResultSet rs = ps.executeQuery();
    List<Book> bookList = new LinkedList<>();
    Book book;
    if (rs != null) {
      while (rs.next()) {
        book = new Book(rs.getInt(1), rs.getInt(2),
            rs.getString(3), rs.getString(4),
            rs.getString(5), "", "", "", "");
        bookList.add(book);
      }
    }
    return bookList;
  }

  public List<Book> bookListByPublisher(String publisher) throws SQLException {
    conn = LibraryDBConnection.getConnection();
    String sql = "select id, lib_id, bookname, writername, publisher from books where publisher like ?;";
    PreparedStatement ps = conn.prepareStatement(sql);
    ps.setString(1, publisher);
    ResultSet rs = ps.executeQuery();
    List<Book> bookList = new LinkedList<>();
    Book book;
    if (rs != null) {
      while (rs.next()) {
        book = new Book(rs.getInt(1), rs.getInt(2),
            rs.getString(3), rs.getString(4),
            rs.getString(5), "", "", "", "");
        bookList.add(book);
      }
    }
    return bookList;
  }

  public int bookCreate(Book book) throws SQLException {
    conn = LibraryDBConnection.getConnection();
    String sql = "insert into books (lib_id, bookname, writername, publisher, bookclass, isbn, kubun, status) " +
        "values (?,?,?,?,?,?,?,?);";
    PreparedStatement ps = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
    ps.setInt(1, book.getLibId());
    ps.setString(2, book.getBookname());
    ps.setString(3, book.getWritername());
    ps.setString(4, book.getPublisher());
    ps.setString(5, book.getBookClass());
    ps.setString(6, book.getIsbn());
    ps.setString(7, book.getKubun());
    ps.setString(8, book.getStatus());
    if (ps.executeUpdate() == 1) {
      ResultSet rs = ps.getGeneratedKeys();
      rs.next();
      return rs.getInt(1);
    }
    return -1;
  }

  public void bookUpdate(Book book, String status) throws SQLException { // ==> enum
    conn = LibraryDBConnection.getConnection();
    String sql = "update books set status = ? where id = ? and lib_id = ?;";
    PreparedStatement ps = conn.prepareStatement(sql);
    ps.setString(1, status);
    ps.setInt(2, book.getId());
    ps.setInt(3, book.getLibId());
    if (ps.executeUpdate() == 1) {
      System.out.println("수정 성공");
    } else {
      System.out.println("수정 실패");
    }
  }

  public void bookDelete(Book book) throws SQLException {
    conn = LibraryDBConnection.getConnection();
    String sql = "delete from books where id = ? and lib_id = ?;";
    PreparedStatement ps = conn.prepareStatement(sql);
    ps.setInt(1, book.getId());
    ps.setInt(2, book.getLibId());
    if (ps.executeUpdate() == 1) {
      System.out.println("삭제 성공");
    } else {
      System.out.println("삭제 실패");
    }
  }

  boolean bookCheck(Book book) throws SQLException {
    conn = LibraryDBConnection.getConnection();
    String sql = "select status from books where id = ? and lib_id = ?;";
    PreparedStatement ps = conn.prepareStatement(sql);
    ps.setInt(1, book.getId());
    ps.setInt(2, book.getLibId());
    ResultSet rs = ps.executeQuery();
    if (rs != null && rs.next()) {
      String status = rs.getString(1);
      if (status.equals("대출중") || status.equals("대출가능"))
        return false;
      else if (status.equals("분실") || status.equals("파손") || status.equals("노후"))
        return true;
    }
    return false;   /// status 를 return 하는 방법으로 변경하는 것이 좋을지 확인 필요!!!
  }

  public boolean isbnDuplicateCheck(String isbn) throws SQLException {
    conn = LibraryDBConnection.getConnection();
    String sql = "select * from books where isbn = ? ;";
    PreparedStatement ps = conn.prepareStatement(sql);
    ps.setString(1, isbn);

    ResultSet rs = ps.executeQuery();
    if (rs == null) {
      return true;
    } else {
      return false;
    }
  }
}
