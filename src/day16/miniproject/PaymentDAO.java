package day16.miniproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PaymentDAO {

  public static void newPayment(Connection conn, Students student, Restaurant restaurant, int amount) throws SQLException {
    System.out.println("결제처리 중...");
    String sql = "insert into payments (rid, sid, date, amount) values (?,?,?,?) ;";
    PreparedStatement st = conn.prepareStatement(sql);
    st.setInt(1, restaurant.getId());
    st.setInt(2, student.getId());
    st.setString(3, student.getDate());
    st.setInt(4, amount);
    if (st.executeUpdate() == 1) {
      StudentDAO.updateAmount(conn, student,amount);
    } else {
      System.out.println("결제 실패");
    }
  }
}
