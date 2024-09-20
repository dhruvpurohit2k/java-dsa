public class fib {
  public static void main(String[] args) {
    int x = 0;
    int y = 1;
    int sum=1,count=0;
    while(count<10){
      System.out.printf("Iteration - %d x is %d y is %s sum is %d\n",count+1,x,y,sum);
      System.out.println(x);
      x = y;
      y = sum;
      sum = y+x;

      count++;
    }
  }
}
