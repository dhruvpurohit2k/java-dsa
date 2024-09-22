public class consChain extends Base {
  {
    System.out.println("child class consChain's init block");
  }
  consChain() {
    System.out.println("No-argument constructor of  child  class consChain");
  }

  consChain(String s) {
    super(s);
    System.out.println("Calling parameterised constructor of  child  class consChain");
  }
  static{
    System.out.println("child class consChain's static block");
  }
  // {
  //   System.out.println("child class consChain's init block");
  // }
  public static void main(String[] args) {
    consChain obj = new consChain("test");
  }
}

class Base {
  String name;

  Base() {
    this("");
    System.out.println("No-argument constructor of  base class");
  }

  Base(String s) {
    this.name = name;
    System.out.println("Calling parameterised constructor of base class");
  }
  static{
    System.out.println("base class static block");
  }
  {
    System.out.println("base class instance block");
  }
}
