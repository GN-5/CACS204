public class Circle extends Shape {
    int radius;
    final long PI = (22 / 7);

    Circle() {
    }

    Circle(int radius) {
        this.radius = radius;
    }

    long calcArea() {
        return radius * radius * PI;
    }

    long calcPerimeter() {
        return 2 * radius * PI;
    }
}
