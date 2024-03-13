package day7.chapter6;

class Box{
  public Box(String s){

  }
  public Box(){

  }

}

class ColoredBox extends Box{

  public ColoredBox(){

  }

  public ColoredBox(String s){

    super();
    System.out.println();
  }
}

public class BoxDemo {
  public static void main(String[] args) {
    ColoredBox box = new ColoredBox();
    ColoredBox box2 = new ColoredBox("box");
  }
}
