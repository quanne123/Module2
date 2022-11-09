import java.util.Scanner;

public class SoNguyenToDauTien20 {
    public static void main(String[] args) {
        int dem =0;
        int i = 2;
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        number = sc.nextInt();
       while (dem < number){
           if (isPrimeNumber(i)){
               System.out.println(i + " ");
               dem++;
           }
           i++;
       }

    }

    public static boolean isPrimeNumber(int number){
        if (number<2){
            return false;
        }
        for (int i =2;i <= Math.sqrt(number);i++){
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }
}
