public class exStackTrace {
  void method1(int x){
    System.out.println("method1");
    method2();
  }
  void method2(){
    System.out.println("method2");
    method3();
  }
  void method3(){
    System.out.println("method3");
    System.out.println(10/0);
  }
  public static void main(String[] args) {
    exStackTrace obj = new exStackTrace();
    obj.method1(10);
  }
}
