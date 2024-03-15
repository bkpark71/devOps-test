package day9.chapter7;

public class AnimalDemo {
  public static void main(String[] args) {
    Dog d = new Dog();
    Cuckoo c = new Cuckoo();

    makeSound(d);
    makeSound(c);
  }

  static void makeSound(Animal a){
    a.sound();
  }
}
