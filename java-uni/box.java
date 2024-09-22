public class box {

  int len;
  int width;
  int height;

  box(int a, int b, int c){
    this.len = a;
    this.width = b;
    this.height = c;
  }
  box(int x){
    this.len = x;
    this.width = x;
    this.height = x;
  }

  box(){
    this.len = -1;
    this.width = -1;
    this.height = -1;
  }

  int volume(){
    return this.len*this.width*this.height;
  }

  public static void main(String[] args) {
    box cuboid = new box(1,2,3);
    box cube = new box(4);
    box noargs = new box();

    System.out.println("Volume of Cuboid is "+ cuboid.volume());
    System.out.println("Volume of Cube is "+ cube.volume());
    System.out.println("Volume of box with no argument is "+ noargs.volume());
    
  }
}
