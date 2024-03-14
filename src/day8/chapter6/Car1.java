package day8.chapter6;

public class Car1 extends Vehicle1{
  int displacement;
  int gears;

  public Car1(String color, int speed, int displacement, int gears) {
    super(color, speed);
    this.displacement = displacement;
    this.gears = gears;
  }

  @Override
  void show(){
    System.out.printf("색상 : %s, 속도 : %d, 배기량 : %d, 기어단수 : %d\n",
                       color,speed,displacement,gears);
  }
}
