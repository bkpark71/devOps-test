package day15.chapter18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DB2Demo {
  public static void main(String[] args) throws SQLException{
    Connection conn = makeConnection();
    Statement st = conn.createStatement();
    String sql = "insert into mytable (id, name, age) values (4, '임꺽정', 40) ;";
    if(st.executeUpdate(sql) == 1) {
      System.out.println("레코드 추가 성공");
    } else {
      System.out.println("레코드 추가 실패");
    }
    conn.close();
    st.close();
  }
  private static Connection makeConnection() {
    String url = "jdbc:mysql://localhost/mydata?serverTimezone=Asia/Seoul";
    Connection conn = null;
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");

      System.out.println("데이터베이스 연결중 ...");
      conn = DriverManager.getConnection(url, "root", "1111");
      System.out.println("데이터베이스 연결 성공 !!!");
    } catch (ClassNotFoundException e) {
      System.out.println("JDBC 드라이버를 찾지 못했습니다.");
    } catch (SQLException e) {
      System.out.println("데이터베이스 연결 실패 ...");
    }
    return conn;
  }

}
