package day9.chapter7;

public class TalkableTest {
  public static void main(String[] args) {
    speak(new Korean());
    speak(new American());
  }

  static void speak(Talkable talkable){
    talkable.talk();
  }
}
