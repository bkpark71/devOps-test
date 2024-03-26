package day16.miniproject;

import java.sql.*;
import java.time.LocalDate;

public class StudentDAO {
  static final int AMOUNT_PER_HOUR = 2000;

  public static boolean checkStudent(Connection conn, int id) throws SQLException {
    String sql = "select id from students where id = ? and date = ? ;";
    LocalDate date = LocalDate.now();
    System.out.println(date);
    PreparedStatement st = conn.prepareStatement(sql);
    st.setInt(1, id);
    st.setString(2, date.toString());
    ResultSet resultSet = st.executeQuery();
    if (resultSet != null && resultSet.next()) {
      if (resultSet.getInt(1) == id) {
        return true;
      } else {
        return false;
      }
    } else {
      return false;
    }
  }
  public static void insertStudent(Connection conn, String name, int hours) throws SQLException {
    String sql = "insert into students (date,name,amount) values (?,?,?) ;";
    LocalDate date = LocalDate.now();
    System.out.println("localdate ==> " + date);
    PreparedStatement st = conn.prepareStatement(sql);
    st.setString(1, date.toString());
    st.setString(2, name);
    st.setInt(3, hours * AMOUNT_PER_HOUR);
    if (st.executeUpdate() == 1) {
      System.out.println("학생 정보 추가 성공");
    } else {
      System.out.println("학생 정보 추가 실패");
    }
  }

  public static void updateStudent(Connection conn, int id, String name, int hours) throws SQLException {
    LocalDate date = LocalDate.now();
    Date date1 = Date.valueOf(date);

    String sql = "UPDATE students SET name = ? WHERE id = ? and date = ?;";
    PreparedStatement st = conn.prepareStatement(sql);
    st.setString(1, name);
    st.setInt(2, id);
    //st.setString(3, date.toString());
    st.setDate(3, date1);
    // 입력받은 시간을 이용해 금액 수정하는 로직 나중에 추가하기
    // 차액이 추가되는 경우에는 기존에 있는 금액 + 차액 추가하기
    // 시간이 감소되는 경우는 감소시킬 만큼의 잔액이 남아 있으면 감소시켜주기, 그렇지 않은 경우에는 메시지 보내주고 별도 처리
    if (st.executeUpdate() == 1) {
      System.out.println("학생 정보 수정 성공");
    } else {
      System.out.println("학생 정보 수정 실패");
    }
  }

  public static Students getStudent(Connection conn, int studentId) throws SQLException{
    String sql = "select * from students where id = ? and date = ? ;";
    LocalDate date = LocalDate.now();
    System.out.println(date);
    PreparedStatement st = conn.prepareStatement(sql);
    st.setInt(1, studentId);
    st.setString(2, date.toString());
    ResultSet resultSet = st.executeQuery();
    if (resultSet != null && resultSet.next()) {
      if (resultSet.getInt(1) == studentId) {
        return new Students(studentId, date.toString(), resultSet.getString("name"), resultSet.getInt("amount"));
      } else {
        return null;
      }
    } else {
      return null;
    }
  }

  public static void updateAmount(Connection conn, Students student, int amount) throws SQLException {
    LocalDate date = LocalDate.now();
    Date date1 = Date.valueOf(date);

    String sql = "UPDATE students SET amount = ? WHERE id = ? and date = ?;";
    PreparedStatement st = conn.prepareStatement(sql);
    st.setInt(1, student.getAmount() - amount);
    st.setInt(2, student.getId());
    //st.setString(3, date.toString());
    st.setDate(3, date1);
    // 입력받은 시간을 이용해 금액 수정하는 로직 나중에 추가하기
    // 차액이 추가되는 경우에는 기존에 있는 금액 + 차액 추가하기
    // 시간이 감소되는 경우는 감소시킬 만큼의 잔액이 남아 있으면 감소시켜주기, 그렇지 않은 경우에는 메시지 보내주고 별도 처리
    if (st.executeUpdate() == 1) {
      System.out.println("결제 완료");
    } else {
      System.out.println("결제 실패");
    }
  }
}
