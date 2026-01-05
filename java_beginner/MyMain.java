 class Cube{
double width;
double height;
double depth;
Cube()
{
    System.out.println("Constructing cube");
    width=10;
    height=10;
    depth=10;
    }
}
 class MyMain{
    public static void main(String[] args) {
            Cube c =new Cube();
            System.out.println(c.width);
    }       
}
