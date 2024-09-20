public class runTimePoly {
  public static void main(String[] args) {
    Parent obj;
    obj = new childOne();
    obj.print();
    obj = new childTwo();
    obj.print();
  }
}

class Parent{
  void print(){
    System.out.println("Parent Class");
  }
}
class childOne extends Parent{
  void print(){
    System.out.println("ChildOne Class");
  }
}
class childTwo extends Parent{
  void print(){
    System.out.println("ChildTwo Class");
  }
}
