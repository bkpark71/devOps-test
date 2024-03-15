package day9.chapter7;

public class Line implements Comparable{
  int length;

  public Line(int length) {
    this.length = length;
  }

  @Override
  public int compareTo(Object o) {
    // 타입체크를 해서 Line 이면
    if(o instanceof Line){
      Line l = (Line)o;
      // length를 비교해서 -1, 0, 1 을 리턴한다.
      if(this.length > l.length) return 1;
      else if (this.length < l.length) return -1;
      else return 0;
    }
    return -999;
  }

  @Override
  public String toString() {
    return "Line[" +
        "length = " + length +
        ']';
  }
}
