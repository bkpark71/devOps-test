package day17.librayproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class UserDAO {
  private Connection conn;

  public List<User> userlist() throws SQLException {
    conn = LibraryDBConnection.getConnection();
    String sql = "select id, lib_id, username from users;";
    PreparedStatement ps = conn.prepareStatement(sql);
    ResultSet rs = ps.executeQuery();
    List<User> userList = new LinkedList<>();
    User user;
    if (rs != null) {
      while (rs.next()) {
        user = new User(rs.getInt(1), rs.getInt(2),
            rs.getString(3), "", "", 0, "");
        userList.add(user);
      }
    }
    return userList;
  }

  public List<User> userlistByName(String username) throws SQLException {
    conn = LibraryDBConnection.getConnection();
    String sql = "select id, lib_id, username from users where username like ? ;";
    PreparedStatement ps = conn.prepareStatement(sql);
    ps.setString(1,username);
    ResultSet rs = ps.executeQuery();
    List<User> userList = new LinkedList<>();
    User user;
    if (rs != null) {
      while (rs.next()) {
        user = new User(rs.getInt(1), rs.getInt(2),
            rs.getString(3), "", "", 0, "");
        userList.add(user);
      }
    }
    return userList;
  }

  public User userByID(int userid, int libId) throws SQLException {
    conn = LibraryDBConnection.getConnection();
    String sql = "select * from users where id = ? and lib_id = ? ;";
    PreparedStatement ps = conn.prepareStatement(sql);
    ps.setInt(1,userid);
    ps.setInt(2,libId);
    ResultSet rs = ps.executeQuery();
    User user;
    if (rs != null && rs.next()) {
      user = new User(rs.getInt(1), rs.getInt(2),
          rs.getString(3), rs.getString(4),
          rs.getString(5), rs.getInt(6), rs.getString(7));
      return user;
    }
    return null;
  }

  public boolean telnoDuplicateCheck(String telno) throws SQLException {
    conn = LibraryDBConnection.getConnection();
    String sql = "select * from users where telno like ? ;";
    PreparedStatement ps = conn.prepareStatement(sql);
    ps.setString(1, telno);

    ResultSet rs = ps.executeQuery();
    System.out.println(rs);

    if (rs != null && rs.next()) {
      System.out.println(rs.getString("telno"));
      return true;  // 중복되는 전화번호 있음
    } else {
      return false; // 중복되는 전화번호 없음
    }
  }

  public int userCreate(User user) throws SQLException {
    conn = LibraryDBConnection.getConnection();
    String sql = "insert into users (lib_id, username, telno, address, point, password) " +
        "values (?,?,?,?,?,?);";
    PreparedStatement ps = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
    ps.setInt(1, user.getLibId());
    ps.setString(2, user.getUsername());
    ps.setString(3, user.getTelno());
    ps.setString(4, user.getAddress());
    ps.setInt(5, user.getPoint());
    ps.setString(6, user.getPassword());

    if (ps.executeUpdate() == 1) {
      ResultSet rs = ps.getGeneratedKeys();
      rs.next();
      return rs.getInt(1);
    }
    return -1;
  }

  public void userUpdate(User user, UserUpdateDTO userUpdate) throws SQLException {
    conn = LibraryDBConnection.getConnection();
//    비밀번호가 일치하는 경우에만 개인정보(주소와 연락처)를 수정할 수 있다.
//    연락처 인증이 되는 경우 비밀번호를 수정할 수 있다. 포인트는 수정 불가
    // 동적쿼리가 필요한 부분 ==> 설명.... 인증관련 처리...

    System.out.println(user.getTelno());
    System.out.println(user.getPassword());
    System.out.println(user.getAddress());


    String sql = "update users " +
        "set " +
        "telno = ? , " +
        "address = ? , " +
        "password = ? " +
        "where id = ? and lib_id = ? and password like ?;";
    PreparedStatement ps = conn.prepareStatement(sql);
    if (userUpdate.getTelno() == null || userUpdate.getTelno().isBlank() || userUpdate.getTelno().isEmpty()) { // 전화번호 변경 없음
      ps.setString(1, user.getTelno());
    } else {
      ps.setString(1, userUpdate.getTelno());
    }
    if (userUpdate.getAddress() == null || userUpdate.getAddress().isEmpty() || userUpdate.getAddress().isBlank()) { // 주소 변경 없음
      ps.setString(2, user.getAddress());
    } else {
      ps.setString(2, userUpdate.getAddress());
    }
    if (userUpdate.getPassword() == null || userUpdate.getPassword().isEmpty() || userUpdate.getPassword().isBlank()) { // 암호 변경 없음
      ps.setString(3, user.getPassword());
    } else {
      ps.setString(3, userUpdate.getPassword());
    }
    ps.setInt(4, user.getId());
    ps.setInt(5, user.getLibId());
    ps.setString(6, user.getPassword());
    //System.out.println(sql);
    int cnt = ps.executeUpdate();
    System.out.println(cnt);
    if (cnt == 1) {
      System.out.println("수정 성공");
    } else {
      System.out.println("수정 실패");
    }
  }

  public boolean userCheck(User user) throws SQLException {
    conn = LibraryDBConnection.getConnection();
    String sql = "select * from checkout where user_id = ? and lib_id = ? and checkin_date is null;";
    PreparedStatement ps = conn.prepareStatement(sql);
    ps.setInt(1, user.getId());
    ps.setInt(2, user.getLibId());
    ResultSet rs = ps.executeQuery();
    if (rs != null && rs.next()) {
      return false;   // 반납하지 않은 도서가 남아있는 경우
    } else {
      return true;  // 대출한 모든 도서를 반납 완료한 경우
    }
  }

  public void userDelete(User user) throws SQLException {
    conn = LibraryDBConnection.getConnection();
    String sql = "delete from users where id = ? and lib_id = ?;";
    PreparedStatement ps = conn.prepareStatement(sql);
    ps.setInt(1, user.getId());
    ps.setInt(2, user.getLibId());
    if (ps.executeUpdate() == 1) {
      System.out.println("삭제 성공");
    } else {
      System.out.println("삭제 실패");
    }
  }
}
