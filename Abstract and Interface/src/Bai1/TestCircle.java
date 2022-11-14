public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(2.5);
        System.out.println(circle);
        circle = new Circle(2.5);
        System.out.println(circle);
        circle = new Circle("red",true,4.5);
        System.out.println(circle);
    }
}
