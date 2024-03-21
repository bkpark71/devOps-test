package day13.chapter12;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class OptionalDemo {
  public static void main(String[] args) {
    OptionalInt i = OptionalInt.of(100);
    OptionalDouble d = OptionalDouble.of(3.14);
    Optional<String> hello = Optional.of("hello");

    Util.print(i);
    //Util.print(i.get());
    Util.printWithParenthesisln(i.getAsInt());

    Util.print(d);
    Util.printWithParenthesisln(d.getAsDouble());

    Util.print(hello);
    Util.printWithParenthesisln(hello.get());

    System.out.println(divide(1.0,2.0).getAsDouble());
    System.out.println(divide(1.0,0));
    System.out.println(divide(1.0,0).isEmpty());

    System.out.println(Optional.ofNullable("a"));
    System.out.println(Optional.ofNullable(null));

    System.out.println(Optional.ofNullable(null).orElse("값이 없음"));
    System.out.println(Optional.ofNullable("a").orElse("값이 있음"));

    Optional<String> o = Optional.ofNullable("안녕");
    Optional<Object> o1 = Optional.ofNullable(null);
    o.ifPresent(Util::printWithParenthesisln);
    o.ifPresentOrElse(Util::printWithParenthesisln,
        () -> System.out.println("없음"));
    o1.ifPresentOrElse(Util::printWithParenthesisln,
        () -> System.out.println("없음"));

  }

  static OptionalDouble divide(double x, double y) {
//    if ( y == 0 )
//      return OptionalDouble.empty();
//    else
//        return OptionalDouble.of(x / y);
    return y == 0 ? OptionalDouble.empty() : OptionalDouble.of(x / y) ;
  }
}
