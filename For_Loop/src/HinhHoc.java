import java.util.Scanner;

public class Hinh_hoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hight;
        System.out.printf("\n\n Nhập vào chiều cao của tam giác: ");
        hight = sc.nextInt();
        for (int i =1; i<= hight;++i){
            for (int j =1 ;j<= i;++j){
                System.out.print("* ");
            }
            System.out.println();
        }
        int hight1;
        hight1 = sc.nextInt();
        for (int i = hight;i >= 1;--i){
            for (int j = 1;j<=i ;++j){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
