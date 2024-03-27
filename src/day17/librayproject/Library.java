package day17.librayproject;

public class Library {
  private int id;
  private String name;
  private String address;
  private String telno;
  private String info;

  public Library(int id, String name, String address, String telno, String info) {
    this.id = id;
    this.name = name;
    this.address = address;
    this.telno = telno;
    this.info = info;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getAddress() {
    return address;
  }

  public String getTelno() {
    return telno;
  }

  public String getInfo() {
    return info;
  }
}
