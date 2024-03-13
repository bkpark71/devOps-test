package day7.chapter5;

enum Week {
  MON("월"), TUE("화"), WED("수"), THU("목"),
  FRI("금"), SAT("토"), SUN("일");
  private String s;
  Week(String s){
    this.s = s;
  }
  public String toString(){
    return s;
  }
}
