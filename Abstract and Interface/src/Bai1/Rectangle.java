public class Rectangle extends Shape implements Resizeable {
    private double width = 1.0;
    private double height = 1.0;
    public Rectangle(double v, double v1){}

    public Rectangle(double width, double height,String color,boolean filled) {
        super(color, filled);
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

public void resize(double percent){
        width=this.width*100/percent;
        height=this.height*100/percent;
}
}
