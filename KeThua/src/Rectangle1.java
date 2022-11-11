public class Rectangle1 extends Shape {
    private double width = 1.0;
    private double height = 2.0;
    public Rectangle1(double side, double v, String color, boolean filled){
    }
    public Rectangle1(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(){
        return width * height;
    }
    public double getPerimeter(){
        return (width + height) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle1{" +
                "width=" + width +
                ", height=" + height +
                '}'  + "which is a subclass of yyy " + super.toString();
    }
}
