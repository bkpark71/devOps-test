package day16.miniproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RestaurantDAO {
  public static void updateRestaurant(Connection conn, int id, String name) throws SQLException {
    System.out.println("식당 정보를 수정합니다.");
    String sql = "UPDATE restaurants SET name = ? WHERE id = ? ;";
    PreparedStatement st = conn.prepareStatement(sql);
    st.setString(1, name);
    st.setInt(2, id);
    if (st.executeUpdate() == 1) {
      System.out.println("식당 정보 수정 성공");
    } else {
      System.out.println("식당 정보 수정 실패");
    }
  }

  public static void insertRestaurant(Connection conn, String name) throws SQLException {
    System.out.println("식당 정보를 추가합니다.");
    String sql = "insert into restaurants (name) values (?) ;";
    PreparedStatement st = conn.prepareStatement(sql);
    st.setString(1, name);
    if (st.executeUpdate() == 1) {
      System.out.println("식당 정보 추가 성공");
    } else {
      System.out.println("식당 정보 추가 실패");
    }
  }

  public static Restaurant getRestaurant(Connection conn, int restId) throws SQLException{
    String sql = "select * from restaurants where id = ? ";
    PreparedStatement st = conn.prepareStatement(sql);
    st.setInt(1, restId);
    ResultSet resultSet = st.executeQuery();
    if (resultSet != null && resultSet.next()) {
      if (resultSet.getInt(1) == restId) {
        return new Restaurant(restId, resultSet.getString("name"));
      } else {
        return null;
      }
    } else {
      return null;
    }
  }
}
