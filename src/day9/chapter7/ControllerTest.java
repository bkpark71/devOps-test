package day9.chapter7;

public class ControllerTest {
  public static void main(String[] args) {
    Controller[] controllers = {
        new TV2(false),
        new Radio(true)
    };

    for (Controller controller : controllers) {
      controller.show();
    }
  }
}
