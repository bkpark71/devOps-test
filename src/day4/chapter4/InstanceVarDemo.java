package day4.chapter4;

public class InstanceVarDemo {
  public static void main(String[] args) {
    InstanceVarClass.methodStatic();
    System.out.println(InstanceVarClass.common);

    InstanceVarClass i1 = new InstanceVarClass();
    i1.instanceVar++;
    i1.common++;
    System.out.println(i1.instanceVar);

    InstanceVarClass i2 = new InstanceVarClass();
    i2.instanceVar++;
    i2.common++;
    System.out.println(i2.instanceVar);

    InstanceVarClass i3 = new InstanceVarClass();
    i3.instanceVar++;
    i3.common++;
    System.out.println(i3.instanceVar);
    System.out.println(InstanceVarClass.common);
  }
}
