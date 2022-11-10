import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius");
        double radius = sc.nextDouble();

        Circle Circle = new Circle(radius);
        System.out.println("your area Circle is" + Circle.getArea());
    }
}
