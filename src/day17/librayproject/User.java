package day17.librayproject;

public class User {
  private int id;
  private int libId;
  private String username;
  private String telno;
  private String address;
  private int point;
  private String password;

  public User(int id, int libId, String username, String telno, String address, int point, String password) {
    this.id = id;
    this.libId = libId;
    this.username = username;
    this.telno = telno;
    this.address = address;
    this.point = point;
    this.password = password;
  }

  public int getId() {
    return id;
  }

  public int getLibId() {
    return libId;
  }

  public String getUsername() {
    return username;
  }

  public String getTelno() {
    return telno;
  }

  public String getAddress() {
    return address;
  }

  public int getPoint() {
    return point;
  }

  public String getPassword() {
    return password;
  }

  @Override
  public String toString() {
    return "User[" +
        "id=" + id +
        ", libId=" + libId +
        ", username='" + username + '\'' +
        ']';
  }
}
