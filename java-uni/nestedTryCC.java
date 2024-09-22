public class nestedTryCC {

  public static void main(String[] args) {
    try {
      try {
        try {
          int[] array = { 1, 2, 3, 4 };
          System.out.println(array[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
          // System.out.println("ArrayIndexOutOfBoundsException");
          System.out.println("try-block 1***********");
          e.printStackTrace();
        }
        int a = 10, b = 0;
        System.out.println(a/b);
      } catch (ArithmeticException e) {
        // System.out.println("ArithmeticException");
        System.out.println("try-block 2**********");
        e.printStackTrace();
      }
      String name = null;
      System.out.println(name.length());
    } catch (ArrayIndexOutOfBoundsException e) {
      // System.out.println("ArrarIndexOutOfBoundsException");
      System.out.println("Handled in Main try-block");
    } catch (Exception e) {
      // System.out.println("Exception");
      System.out.println("Handled in Main try-block*************");
      System.out.println(e.toString());
    }
  }

}
