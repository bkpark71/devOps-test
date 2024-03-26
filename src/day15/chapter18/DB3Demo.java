package day15.chapter18;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB3Demo {
  public static void main(String[] args) throws SQLException {
    Connection conn = DBConnectionDemo.makeConnection();
    Statement st = conn.createStatement();
    String sql = "SELECT name, age FROM mytable;";
    ResultSet rs = st.executeQuery(sql);

    while(rs.next()) {
      System.out.print("name : " + rs.getString(1) + '\t');
      System.out.println("age : " + rs.getInt(2));
    }
    rs.close();
    st.close();
    conn.close();
  }
}
