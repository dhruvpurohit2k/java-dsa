public class obj {

  obj(Object o){
    System.out.println("Hello");
  }
  obj( obj o){
    System.out.println("World");
  }
  public static void main(String[] args) {
    new obj(null);
  }
}
