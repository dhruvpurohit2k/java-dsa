public class sleep {
  public static void main(String[] args) {
    System.out.println("Message before sleep");
    try{Thread.sleep(2000);}catch(InterruptedException e){}
    System.out.println("Message after sleep");
  }
  
}
