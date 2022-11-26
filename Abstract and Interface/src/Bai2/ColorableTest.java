package Bai2;
import ;

public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(3);
        shapes[1] = new Rectangle(6, 8,"red",true);
        shapes[2] = new Square(3);
        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                Circle circle = (Circle) shape;
                System.out.println(circle);
            } else if (shape instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) shape;
                System.out.println(rectangle);
            } else if (shape instanceof Square) {
                Square square = (Square) shape;
                if (square instanceof Colorable) {
                    System.out.println("");
                    square.howtoColor();

                    System.out.println(square);

                }

            }
        }
    }
}

