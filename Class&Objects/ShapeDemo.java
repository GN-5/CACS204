import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
//import java.util.Scanner;

public class ShapeDemo {

    public static void main(String args[]) {

        // Scanner input = new Scanner(System.in);

        // Rectangle r1 = new Rectangle();
        // Rectangle s1 = new Rectangle();

        // AdvRectangle r3 = new AdvRectangle(5, 4, 2);

        // Circle c1 = new Circle(5);

        // try {

        // r1.setDim(-12, 12);

        // s1.setDim(15, true);
        // } catch (NegativeNumberException ex) {
        // System.out.println(ex.toString());
        // }

        // Rectangle r2 = new Rectangle(50, true);

        // System.out.println("Area of r1 is " + r1.calcArea());

        // System.out.println("Perimeter of s1 is " + s1.calcPerimeter());

        // System.out.println("Area of r2 is " + r2.calcArea());

        // System.out.println("No. of Rectangles Created" + Rectangle.getCount());

        // System.out.println("r1 == r2 " + r1.isEqual(r2));

        // input.close();

        // System.out.println("The area is " + r3.calcArea() + " and the border width is
        // " + r3.getborderWidth());
        // System.out
        // .println("The perimeter is " + r3.calcPerimeter() + " and the border width is
        // " + r3.getborderWidth());

        // System.out.println("The area is " + c1.calcArea() + " and the perimeter is "
        // + c1.calcPerimeter());

        try (ObjectOutputStream op = new ObjectOutputStream(new FileOutputStream("rectangle.bin"))) {
            Rectangle rect3 = new Rectangle(10, 20);
            op.writeObject(rect3);
            System.out.println(rect3);
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
    }
}