import java.sql.SQLOutput;
import java.util.Scanner;

public class linear_equation_resolver {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver"); // giai phuong trinh
        System.out.println("Given a equation as 'a * x + b = c', please enter constands:");//ax+b=c
        Scanner scanner = new Scanner(System.in);
        System.out.println("a: "); // nhap a
        double a = scanner.nextDouble();//Nhap a
        System.out.println("b:");
        double b = scanner.nextDouble(); //Nhap b
        System.out.println("c:");
        double c = scanner.nextDouble(); // Nhap c
        if (a != 0) { // neu a khac 0
            double answer = (c - b) / a;
            System.out.printf("Equation pass with x =%f!\n", answer);
        } else {
            if (b == c) {
                System.out.println("The solution is all x!");

            } else {
                System.out.println("No solution"); //khong co ket qua
            }
        }
    }
}
