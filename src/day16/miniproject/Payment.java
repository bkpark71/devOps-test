package day16.miniproject;

public class Payment {
  private int id;
  private int rId;
  private int sId;
  private String date;
  private int amount;

  public Payment(int id, int rId, int sId, String date, int amount) {
    this.id = id;
    this.rId = rId;
    this.sId = sId;
    this.date = date;
    this.amount = amount;
  }

  public int getId() {
    return id;
  }

  public int getrId() {
    return rId;
  }

  public int getsId() {
    return sId;
  }

  public String getDate() {
    return date;
  }

  public int getAmount() {
    return amount;
  }
}
