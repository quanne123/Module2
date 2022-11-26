
public class RectangleTest {


    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2.7, 5.3);
        System.out.println(rectangle);

        rectangle = new Rectangle(2.7 , 5.3);
        System.out.println(rectangle);

        rectangle = new Rectangle(6,9,"yellow",true);
        System.out.println(rectangle);
    }
}
