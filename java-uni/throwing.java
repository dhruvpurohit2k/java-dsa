
public class throwing {
  public static void main(String[] args) {
    try {
      throw new Test();
    } catch (Test e) {
      System.out.println("Got Test Exception");
    } finally {
      System.out.println("Inside finally Block");
    }
  }
}
class Test extends Exception {
}
