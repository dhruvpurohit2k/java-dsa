public class nestedTry {
  public static void main(String[] args) {
    try {
      try {
        try {
            int[] array = {1,2,3,4};
            System.out.println(array[10]);
        } catch (ArithmeticException e) {
          System.out.println("ArithmeticException");
          System.out.println("try-block 1");
        }
      } catch (ArithmeticException e) {
        System.out.println("ArithmeticException");
        System.out.println("try-block 2");
      }
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("ArrarIndexOutOfBoundsException");
      System.out.println("Handled in Main try-block");
    } catch (Exception e) {
      System.out.println("Exception");
      System.out.println("Handled in Main try-block");
    }
  }
}
