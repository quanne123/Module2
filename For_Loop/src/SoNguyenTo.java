import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = Integer.parseInt(sc.nextLine());
        boolean flag = true;
        for (int i =2;i<=Math.sqrt(number);i++){
        if (number % i == 0){
            flag = false;
            break;
        }

        }if (flag){
            System.out.println(number + "is a prime");
        }else {
            System.out.println(number + "is not a number");
        }
    }
}
