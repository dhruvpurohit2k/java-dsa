public class implicit {

  void print(String s){
    System.out.println("String Method - ");
    System.out.println(s);
  }
  void print(double d ){
    System.out.println("Double passed ");
    System.out.println(d);
  }

  public static void main(String[] args) {
    implicit obj = new implicit();
    String s = "Hello Wordl";
    obj.print(s);
    int x = 10;
    obj.print(x);
  }
  
}
