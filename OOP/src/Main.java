import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width: ");
        double width = sc.nextDouble();
        System.out.println("Enter the height");
        double height = sc.nextDouble();
        HinhChuNhat  HinhChuNhat = new HinhChuNhat(width,width);
        System.out.println("Your Rectangle \n" + HinhChuNhat.display());
        System.out.println("Perimeter of the Rectangle: " + HinhChuNhat.getPerimeter());
        System.out.println("Area of the Rectangle: " + HinhChuNhat.getArea());
    }
    }
