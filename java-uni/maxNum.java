public class maxNum {
  public static void main(String[] args) {
    int[] array = { 3, 6, 10, 1, 4, 14, 2, 3 };
    int maxNum = 0;
    for(int i = 0; i<array.length;i++){
      if(maxNum<array[i]) maxNum = array[i];
    }
    System.out.println(maxNum);
  }
}
