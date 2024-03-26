package day16.miniproject;


import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class FoodConDemo {


  public static void main(String[] args) throws SQLException {
    Connection conn = DBConnection.getConnection();
    Scanner in = new Scanner(System.in);

    System.out.println("1. 식당 2. 수강생 3. 결제");
    int menu = in.nextInt();
    if (menu == 1) {
      System.out.println("식당을 추가,수정작업을 합니다.");
      restManage(in, conn);
    } else if (menu == 2) {
      System.out.println("학생을 추가,수정작업을 합니다.");
      studentManage(in, conn);
    } else if (menu ==3) {
      System.out.println("결제 작업을 합니다.");
      paymentManage(in, conn);
    }
  }

  private static void paymentManage(Scanner in, Connection conn) throws SQLException{
    System.out.print("수강생 번호를 입력하세요 : ");
    int student_id = in.nextInt();
    Students student = StudentDAO.getStudent(conn, student_id);
    System.out.print("식당 번호를 입력하세요 : ");
    int rest_id = in.nextInt();
    Restaurant restaurant = RestaurantDAO.getRestaurant(conn, rest_id);
    System.out.println("현재 잔액은 " + student.getAmount() + "입니다. 결제하실 금액을 입력해주세요.");
    int amount = in.nextInt();
    if(amount > student.getAmount()) {
      System.out.println("잔액 부족");
    } else {
      PaymentDAO.newPayment(conn, student, restaurant, amount);
    }
  }

  private static void studentManage(Scanner in, Connection conn) throws SQLException {
    System.out.println("1. 추가 2. 수정");
    int subMenu = in.nextInt();
    String name = "";
    if (subMenu == 1) {
      System.out.println("추가할 학생의 이름을 입력하세요.");
      in.nextLine();
      name = in.nextLine();
      System.out.println("수강시간을 입력하세요.");
      int hours = in.nextInt();
      StudentDAO.insertStudent(conn, name, hours);
    } else if (subMenu == 2) {
      System.out.println("수정할 학생의 id 를 입력하세요");
      int id = in.nextInt();
      System.out.println("수정할 학생의 이름을 입력하세요");
      in.nextLine();
      name = in.nextLine();
      //System.out.println("변경할 수강시간을 입력하세요.");
      //int hours = in.nextInt();
      if (StudentDAO.checkStudent(conn, id)) {
        StudentDAO.updateStudent(conn, id, name, 0);
      } else {
        System.out.println("존재하지 않거나 수정할 수 없습니다.");
      }
    }
  }
  private static void restManage(Scanner in, Connection conn) throws SQLException {
    System.out.println("1. 추가 2. 수정");
    int subMenu = in.nextInt();
    String name = "";
    if (subMenu == 1) {
      System.out.println("추가할 식당의 이름을 입력하세요.");
      in.nextLine();
      name = in.nextLine();
      RestaurantDAO.insertRestaurant(conn, name);
    } else if (subMenu == 2) {
      System.out.println("수정할 식당의 id 를 입력하세요");
      int id = in.nextInt();
      System.out.println("수정할 식당의 이름을 입력하세요");
      in.nextLine();
      name = in.nextLine();
      RestaurantDAO.updateRestaurant(conn, id, name);
    }
  }
}
