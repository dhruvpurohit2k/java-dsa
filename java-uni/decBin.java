
public class decBin {
  public static void main(String[] args) {
    int decimal = 100;
    int bin = 0;
    int power = 0;
    while(decimal>0){
      System.out.println("Iteration " + (power+1) + "----->");
      bin += decimal%2*(int)Math.pow(10,power);
      decimal/=2;
      power++;
      System.out.printf("BIN = %d DECIMAL = %d POWER = %d\n",bin,decimal,power);
    }
    System.out.println(bin);
  }
}
