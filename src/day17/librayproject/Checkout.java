package day17.librayproject;

import java.util.Date;

public class Checkout {
  private int id;
  private int libId;
  private int bookId;
  private int userId;
  private Date checkoutDate;
  private Date tobeReturnDate;
  private boolean renew;
  private Date renewReturnDate;
  private Date checkinDate;

  public Checkout(int id, int libId, int bookId, int userId, Date checkoutDate, Date tobeReturnDate, boolean renew, Date renewReturnDate, Date checkinDate) {
    this.id = id;
    this.libId = libId;
    this.bookId = bookId;
    this.userId = userId;
    this.checkoutDate = checkoutDate;
    this.tobeReturnDate = tobeReturnDate;
    this.renew = renew;
    this.renewReturnDate = renewReturnDate;
    this.checkinDate = checkinDate;
  }

  public int getId() {
    return id;
  }

  public int getLibId() {
    return libId;
  }

  public int getBookId() {
    return bookId;
  }

  public int getUserId() {
    return userId;
  }

  public Date getCheckoutDate() {
    return checkoutDate;
  }

  public Date getTobeReturnDate() {
    return tobeReturnDate;
  }

  public boolean isRenew() {
    return renew;
  }

  public Date getRenewReturnDate() {
    return renewReturnDate;
  }

  public Date getCheckinDate() {
    return checkinDate;
  }
}
