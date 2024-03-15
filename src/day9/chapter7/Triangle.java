package day9.chapter7;

public class Triangle implements Comparable{
  int width,height;

  public Triangle(int width, int height) {
    this.width = width;
    this.height = height;
  }

  public int findArea(){
    return (width * height) / 2;
     //return (float)1/2 * width * height ; //==> 0
  }

  @Override
  public int compareTo(Object o) {
    if(o instanceof Triangle t) {
      System.out.println(findArea());
      System.out.println(t.findArea());
      return this.findArea() - t.findArea();
    }
    return -999;
  }

  @Override
  public String toString() {
    return "삼각형[" +
        "width=" + width +
        ", height=" + height + ", 넓이=" + findArea() + ']';
  }
}
