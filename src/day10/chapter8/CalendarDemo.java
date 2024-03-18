package day10.chapter8;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo{
  public static void main(String[] args) {
    Date date = new Date();
    System.out.println(date);

    Calendar calendar = Calendar.getInstance();
    System.out.println(calendar);
    System.out.println(calendar.PM);
    System.out.println(calendar.MONTH + 1 + "월 입니다.");
    System.out.println(calendar.get(calendar.HOUR));

  }
}
