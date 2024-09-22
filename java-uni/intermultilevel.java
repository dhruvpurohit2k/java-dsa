public class intermultilevel implements B {
  public void method1() {
    System.out.println("Method1");
  }

  public void method2() {
    System.out.println("Method2");
  }

  public void method3() {
    System.out.println("Method3");
  }

  public static void main(String[] args) {
    intermultilevel obj = new intermultilevel();
    obj.method1();
    obj.method2();
    obj.method3();
  }

}

interface A {
  void method1();

  void method2();
}

interface B extends A{
  void method3();
}