public class revesingNumber {
  public static void main(String[] args) {
    int number = 1234567;    
    int revnumber = 0;
    while(number>0){
      System.out.printf("Number is %d revnumber is %d\n",number,revnumber);
      revnumber = revnumber*10 + number%10;
      number/=10;
    }
    System.out.println(revnumber);
  }
}
