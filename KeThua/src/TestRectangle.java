public class TestRectangle {
    public static void main(String[] args) {
        Rectangle1 rectangle1 = new Rectangle1(7,5);
        System.out.println(rectangle1.toString());
        System.out.println("the width is: " + rectangle1.getWidth());
        System.out.println("The height is : " +rectangle1.getHeight());
        System.out.println("THe Area is: " + rectangle1.getArea());
        System.out.println("The Perimeter is " + rectangle1.getPerimeter());
    }
}
