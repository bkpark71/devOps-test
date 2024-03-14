package day8.chapter6;

public class ForeignStudent extends Student {
  private String nationality;
  // 접근자
  public String getNationality() {
    return nationality;
  }
  // 생성자
  public ForeignStudent(String name, int age, String studentNo, String nationality) {
    super(name, age, studentNo);
    this.nationality = nationality;
  }
  // 메서드
  @Override
  String show() {
    return "사람[" +
        "이름 :'" + getName() + '\'' +
        ", 나이 :" + getAge() + ", 학번 :" + getStudentNo() + ", 국적 :" + nationality + ']';
  }
}
