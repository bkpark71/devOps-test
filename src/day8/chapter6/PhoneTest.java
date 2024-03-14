package day8.chapter6;

public class PhoneTest {
  public static void main(String[] args) {
    Phone[] phones = {
        new Phone("황진이"),
        new Telephone("길동이","내일"),
        new Smartphone("민국이","갤러그")
    };

    for (Phone phone : phones) {
      if (phone instanceof Smartphone s)
        s.playGame();
      else if (phone instanceof Telephone t)
        t.autoAnswering();
      else if (phone instanceof Phone)
        phone.talk();
    }
  }
}
