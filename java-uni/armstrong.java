class armstrong {
  public static void main(String[] args) {
    int number = 371;
    int temp = number;
    int sum = 0;
    while(temp>0){
      int remainder = temp%10;
      temp/=10;
      sum+=remainder*remainder*remainder; 
      System.out.printf("remainder = %d temp = %d sum = %d \n",remainder,temp,sum);
    }
    if(sum==number) System.out.printf("%d is an armstrong number.\n",number);
    else  System.out.printf("%d is not an armstrong number.\n",number);
  }
  
}
