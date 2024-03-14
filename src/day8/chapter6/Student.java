package day8.chapter6;

public class Student extends Person{
  private String studentNo;
  // 접근자
  public String getStudentNo() {
    return studentNo;
  }
  // 생성자
  public Student(String name, int age, String studentNo) {
    super(name, age);
    this.studentNo = studentNo;
  }

  // 메서드
  @Override
  String show() {
    return "사람[" +
        "이름 :'" + getName() + '\'' +
        ", 나이 :" + getAge() + ", 학번 :" + studentNo + ']';
  }
}
