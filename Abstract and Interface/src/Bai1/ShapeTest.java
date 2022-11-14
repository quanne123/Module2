import java.util.Arrays;

import java.util.concurrent.ForkJoinPool;

public class ShapeTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle("Yellow",true,9);
        shapes[1] = new Rectangle(6,7,"red",true );
        shapes[2] = new Square(3);
        for (Shape shape : shapes){
            System.out.println(shape);
            if (shape instanceof Circle){
                Circle circle = (Circle) shape;
                circle.resize(Math.random()*100+1);
                System.out.println(circle);
            } else if (shape instanceof Rectangle) {
                Rectangle rectangle =(Rectangle) shape;
                rectangle.resize(Math.random()*100+1);
                System.out.println(rectangle);

            }else if (shape instanceof Square){
                Square square = (Square) shape;
                square.resize(Math.random()*100+1);
                System.out.println(square);
            }


        }

    }

}
