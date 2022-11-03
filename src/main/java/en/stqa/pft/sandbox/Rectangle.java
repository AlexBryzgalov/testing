package en.stqa.pft.sandbox;

public class Rectangle {
  public double a;
  public double b;
  public Rectangle(double a, double b) {
    this.a = a;
    this.b = b;
  }

  public double area() {
    double area = this.a * this.b;
    return area;
  }
}
