import java.util.Scanner;
import java.util.Stack;

public class FromDecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> arrNumber = new Stack<>();
        int number;
        do {
            System.out.println("nhập 1 số nguyên từ bàn phím : ");
            number = Integer.parseInt(sc.nextLine());
        } while (number <= 0);
        while (number > 0) {
            int sodu = number % 2;
            arrNumber.push(sodu);
            number = number / 2;
        }
        int size = arrNumber.size();
        System.out.print("số sau khi chuyên sang hệ nhị phân là: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arrNumber.pop() + " ");
        }
    }
}