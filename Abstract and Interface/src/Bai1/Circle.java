public  class Circle extends Shape implements Resizeable {
    private double radius = 0;

    public Circle(double v) {
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPetermeter() {
        return radius * 2 * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "} " + super.toString() + "Area is: " + getArea() + "Petermeter is a: " + getPetermeter();
    }

    public void resize(double percent){
        radius=this.radius*100/percent;
    }
}