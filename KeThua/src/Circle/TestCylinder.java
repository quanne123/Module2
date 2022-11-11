public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(2,"Yellow",3);
        System.out.println(cylinder.toString());
        System.out.println(cylinder.getRadius());
        System.out.println("The height is: " + cylinder.getHeight());
        System.out.println("The volume is: " + cylinder.Volume());
    }
}
