package Bai2;

public class Rectangle extends Shape {
    private double width = 0.0;
    private double height = 0.0;
    public Rectangle(){}

    public Rectangle(double width, double height,String color,boolean filled) {
        super(color , filled);
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
        return width * height ;
    }
    public double getPetermeter(){
        return (width + height)*2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                "} " + super.toString() + "Area is a: " +  getArea() +  " Petermeter is a: " + getPetermeter();
    }
    public void howtoColor(){

    }
}
