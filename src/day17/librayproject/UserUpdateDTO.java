package day17.librayproject;

public class UserUpdateDTO {
  private int id;
  private int libId;
  private String telno;
  private String address;
  private String password;
  //private String authno; 인증번호에 대해 어떤식으로 할지 ~~

  public UserUpdateDTO(int id, int libId, String telno, String address, String password){
  //, String authno) {
    this.id = id;
    this.libId = libId;
    this.telno = telno;
    this.address = address;
    this.password = password;
    //this.authno = authno;
  }

  public int getId() {
    return id;
  }

  public int getLibId() {
    return libId;
  }

  public String getTelno() {
    return telno;
  }

  public String getAddress() {
    return address;
  }

  public String getPassword() {
    return password;
  }
}
