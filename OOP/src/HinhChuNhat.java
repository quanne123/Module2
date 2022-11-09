import java.util.Scanner;

public class HinhChuNhat {

    double width, height;

     HinhChuNhat() {
        width = 0;
        height = 0;

    }


    public HinhChuNhat(double width, double height){
        this.width = width;
        this.height = height;
    }
    public double getArea() {
        return this.width * this.height;
    }
    public double getPerimeter(){
        return (this.width + this.height) * 2;
    }
    public String display(){
        return "Hinh Chu Nhat{" + "width=" + width + ",height=" + height + "}";

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width: ");
        double width = sc.nextDouble();
        System.out.println("Enter the height");
        double height = sc.nextDouble();
        HinhChuNhat  HinhChuNhat = new HinhChuNhat(width,height);
        System.out.println("Your Rectangle \n" + HinhChuNhat.display());
        System.out.println("Perimeter of the Rectangle: " + HinhChuNhat.getPerimeter());
        System.out.println("Area of the Rectangle: " + HinhChuNhat.getArea());
    }
}
