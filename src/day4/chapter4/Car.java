package day4.chapter4;

public class Car {
  // 멤버
  // 필드 - 일련번호, 차종, 색깔, 방향
  private static long sequence;
  private long serialNo;
  private String carType;
  String color;
  String direction = "N";
  // 메서드 - go, setDirection
  String getCarType(){
    return carType;
  }
  long getSerialNo(){
    return serialNo;
  }
  void go(){
    if(direction == "D" || direction == "R"){
      System.out.println(direction + "으로 갑니다.");
    } else {
      System.out.println(direction + "입니다.");
    }
  }
  void setDirection(String direction){
    if(direction == "D" || direction == "R" || direction == "N" || direction == "P") {
      this.direction = direction;
    } else {
      System.out.println("방향설정 오류입니다.");
    }
  }
  // 생성자(생성될때 정해지는 필드의 값 초기화)
  Car(String carType, String color){
    sequence++;
    this.serialNo = sequence;
    this.carType = carType;
    this.color = color;
  }
}
