import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        do {
            System.out.println("Nhap number: " );
            number = sc.nextInt();

        }while (number >20);
        fibo(number);
        System.out.println("Fibonacci: " + fibo(number));

    }
    public static int fibo(int  number){
        int S = 2;
        int Fi0 = 1;
        int Fi1 = 1;
        int Fi2 = 2;
        if (number == 1 || number == 2){
            return 1;

        }
        else {
            while (S++ < number){
                Fi2 = Fi0 +Fi1;
                Fi0 = Fi1;
                Fi1 = Fi2;
            }
            return Fi2;
        }
    }
}
