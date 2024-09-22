public class initBlock {
  {
    System.out.println("inti");
  }
  initBlock(){
    System.out.println("Default");
  }
  initBlock(int x){
    System.out.println(x);
  }
  {
    System.out.println("init 2 ");
  }
  public static void main(String[] args) {
     new initBlock();
     new initBlock(10);
  }
}
