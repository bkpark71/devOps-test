package day9.chapter7;

public interface Talkable {
  void talk();
}

class Korean implements Talkable{
  @Override
  public void talk() {
    System.out.println("안녕하세요!");
  }
}

class American implements Talkable{


  @Override
  public void talk() {
    System.out.println("Hello!");
  }
}