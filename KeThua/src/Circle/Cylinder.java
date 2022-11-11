public class Cylinder  extends  Circle2{
    private double height;
    public Cylinder(){
    }
    public Cylinder(double height){
        this.height=height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }


    public double getHeight() {
        return height ;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double Volume(){
        return super.getRadius() * super.getRadius() * Math.PI * height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                '}';
    }
}
