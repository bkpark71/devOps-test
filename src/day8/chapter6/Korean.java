package day8.chapter6;

public class Korean {
  String id;
  String name;

  public Korean(String id, String name){
    this.id = id;
    this.name = name;
  }

  @Override
  public boolean equals(Object obj) {
    if(obj instanceof Korean c) {
      return (this.id == c.id) && (this.name == c.name);
    }
    return false;
  }
}
