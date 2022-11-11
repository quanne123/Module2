public class TestPoint3D {
    public static void main(String[] args) {
        Point3D point3D = new Point3D(3);
        System.out.println(point3D.toString());
        System.out.println("The Z is: " + point3D.getZ());
        System.out.println("The arr1 is: " + point3D.getXYZ());
    }
}
