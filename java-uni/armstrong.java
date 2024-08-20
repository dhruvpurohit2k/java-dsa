
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



class armstrong {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number to check whether its an armstrong or not : ");
    int number = sc.nextInt();
    int temp = number;
    sc.close();
    List<Integer> digits = new ArrayList<>();
    while(number>0){
      digits.add(number%10);
      number/=10;
    }
    int sum=0;
    for(int digit:digits){
      sum+= Math.pow(digit,digits.size());
    } 
    if(sum==temp){
      System.out.printf("%d is an armstrong number",temp);
      System.out.println();
    }else{
      System.out.printf("%d is not an armstrong number",temp);
      System.out.println();
    }
  }
  
}