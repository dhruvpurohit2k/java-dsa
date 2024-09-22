public class inter{
  public static void main(String[] args) {
    Cat cat = new Cat();
    Dog dog = new Dog();
    cat.speak();
    dog.speak();
  } 
}

interface Animal{
  void speak();
}

class Cat implements Animal{
  public void speak(){
    System.out.println("Cats Meows");
  }
}
class Dog implements Animal{
  public void speak(){
    System.out.println("Dog Barks");
  }
}