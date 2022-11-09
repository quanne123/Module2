import java.util.Scanner;

public class HinhHoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hight;
        System.out.println(" Nhập vào chiều cao của tam giác: ");
        hight = sc.nextInt();
        for (int i = 1; i <= hight; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }
        int Hight;
        Hight = sc.nextInt();
        for (int i = Hight; i >= 1; --i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();

        }
        int rows = 5;
        int k = 0;
        for (int i = 1; i <= rows; ++i, k = 0) {
            for (int space = 1; space <= rows - i; ++space) {
                System.out.print(" ");
            }
            while (k != 2 * i - 1) {
                System.out.print("* ");
                ++k;
            }
            System.out.println();
        }
        int height;
        int width;
        int i;
        System.out.println("Enter a height");
        height  = sc.nextInt();
        System.out.println("Enter a weight");
        width = sc.nextInt();
        for (i =1; i <= height;i++){
            for (int j =1;j<= width;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }


    }
}
