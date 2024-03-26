package day15.chapter18;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DB5Demo {
  public static void main(String[] args) throws SQLException {
    //1. 데이터베이스에 연결한다. (jdbc driver 와 database 연결정보를 이용해서 mysql 접속)
    Connection conn = DBConnectionDemo.makeConnection();
    //2. sql 작성
    String sql = "Delete from mytable where id = ? ;";
    //3. statement 객체 생성 -> set 메서드를 이용해서 변수 값을 설정
    PreparedStatement ps = conn.prepareStatement(sql);
    ps.setInt(1,3);
    //4. statement 객체.executeQuery 나 executeUpdate 를 이용해서 데이터를 조작
    if(ps.executeUpdate() == 1)
      System.out.println("삭제 완료");
    else
      System.out.println("삭제 실패");
  }
}
