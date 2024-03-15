package day9.chapter7;

public abstract class Controller {
  boolean power;
  abstract String getName();
  void show(){
    if(power){
      System.out.println(getName() + "가 켜졌습니다.");
    } else {
      System.out.println(getName() + "가 꺼졌습니다.");
    }
  }

  public Controller(boolean power) {
    this.power = power;
  }
}

class TV2 extends Controller{
  private String name = "TV";
  @Override
  String getName() {
    return name;
  }

  public TV2(boolean power){
    super(power);
  }
}

class Radio extends Controller{
  private String name = "Radio";

  public Radio(boolean power) {
    super(power);
  }

  @Override
  String getName() {
    return name;
  }
}
