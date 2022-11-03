package en.stqa.pft.sandbox;

public class test {
  public static void main(String[] args) {
    hello("world");
    hello("Alex");
    hello("user");
    Square s = new Square(8);


    System.out.println("Square area with the side " + s.l + " = " + s.area());

    Rectangle r = new Rectangle(10, 4);

    System.out.println("Rectangle area with the sides " + r.a + " and " + r.b + " = " + r.area());

    Point p = new Point(4.5, -52.45, 56.80, -8.49);
    System.out.println("Distance between 2 points with coordinates of the first point " + p.x1 + " and " + p.x2 +
            " and coordinates of the second point " + p.x2 + " and " + p.y2 + " = " + p.distance());

  }

  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");
  }

}
