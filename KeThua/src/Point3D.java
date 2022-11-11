import java.util.Arrays;

public class Point3D extends Point2D {
    private float z = 0.0f;
    public Point3D(){

    }
    public Point3D(float z){
        this.z=z;
    }
    public Point3D(float x,float y,float z){
        super(x,y);
        this.z=z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public String getXYZ(){
        float[] arr1 = new float[3];
        arr1[0] = getX();
        arr1[1] = getY();
        arr1[2] = z;
        return Arrays.toString(arr1);
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z + super.toString();
    }
}
