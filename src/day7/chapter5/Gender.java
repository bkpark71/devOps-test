package day7.chapter5;

enum Gender {
  MALE("남성") , FEMALE("여성");

  private String s;

//  Gender(){
//
//  }
  Gender(String s){
    this.s = s;
  }
  // 메서드
  public String toString(){
    return s;
  }
}