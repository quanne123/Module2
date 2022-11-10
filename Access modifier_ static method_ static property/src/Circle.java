import java.util.Scanner;

public class Circle {
    private double radius = 1.0;
    private String color = "Red";

    public Circle(){
    }
    public Circle(double radius){
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return (radius * radius * Math.PI) ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius");
        double radius = sc.nextDouble();

        Circle Circle = new Circle(radius);
        System.out.println("your area Circle is" + Circle.getArea());
    }
}
