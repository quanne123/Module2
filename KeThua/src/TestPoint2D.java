public class TestPoint2D {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(3,5);
        System.out.println(point2D.toString());
        System.out.println("the X is: " + point2D.getX());
        System.out.println("the Y is: " + point2D.getY());
        System.out.println("the arr is: " + point2D.getXY());
    }
}
