public class getSet {
 public static void main(String[] args) {
  Person obj = new Person();
  obj.setName("Dhruv");
  obj.getName();
  obj.setName("Purohit");
  obj.getName();
 } 
}

class Person{
  private String name;
  void getName(){
    System.out.println(this.name);
  }
  void setName(String s){
    this.name = s;
  }
}
