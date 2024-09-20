public class binDec {
  public static void main(String[] args) {
    String bin = "1100100";
    int number = 0;
    int pos = 1;
    for(int i = bin.length()-1; i>=0;i--){
      System.out.println();
      System.out.println("char is " + bin.charAt(i));
      System.out.println("power is " + pos);
      System.out.println("number is " + number );
      if(bin.charAt(i)=='1'){
        number+= pos;
      }
      pos*=2;
    }
    System.out.println(number);
  }
}
