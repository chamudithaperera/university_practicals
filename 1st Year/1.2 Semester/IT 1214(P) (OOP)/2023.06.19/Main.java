public class Main {
  public static void main(String[] args) {
    // create some shapes
    Shape rectangle = new Rectangle(10, 12);
    Shape circle = new Circle(5);
    Shape triangle = new Triangle(7, 8, 6);

    System.out.println("Area of rectangle: " + rectangle.calculateArea());
    System.out.println("Perimeter of rectangle: " + rectangle.calculatePerimeter());

    System.out.println("Area of circle: " + circle.calculateArea());
    System.out.println("Perimeter of circle: " + circle.calculatePerimeter());

    System.out.println("Area of triangle: " + triangle.calculateArea());
    System.out.println("Perimeter of triangle: " + triangle.calculatePerimeter());
  }
}
