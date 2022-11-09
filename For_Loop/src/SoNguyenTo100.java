import java.util.Scanner;

public class SoNguyenTo100 {
    public static void main(String[] args) {
        int number;
        System.out.println("enter a number ");
        Scanner sc = new Scanner(System.in);
        number = Integer.parseInt(sc.nextLine());
        if (number >= 2) {
            System.out.println(2);
        }
        for (int i = 3; i < number; i += 2) {
            if (isPrimeNumber(i)) {
                System.out.println(" " + i);
            }
        }
    }

    public static boolean isPrimeNumber(int number) {

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
