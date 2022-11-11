public class Circle1 extends Shape {
    private double radius = 1.0;
    public Circle1(){}
    public Circle1(double radius){
        this.radius= radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return radius * radius *Math.PI;
    }
    public double getPerimeter(){
        return radius * 2 * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle1 with radius  " + radius + "Which is a subclass of yyy " + super.toString();
    }
}
