import java.util.Scanner;

public class Ontap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so vao ");
        int number = Integer.parseInt(sc.nextLine());
        int[] arr = {1, 2, 3, 5, 9, -7, 8};
        findMaxInArray(arr);
        findNumberInArray(arr, number);
//        findPrimeInArray(arr, number);
    }

    public static void findNumberInArray(int[] arr, int number) {
        boolean flag = false;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (number == arr[i]) {
                flag = true;
                index = i;
//                System.out.println("so can tim tai vi tri: " + i);
                break;
            }
        }
        if (flag) {
            System.out.println("So can tim tai vi tri " + index);
        }else {
            System.out.println("khong tim thay so can tim trong Mang");
        }
    }

    public static void findMaxInArray(int[] arr) {
        int max = arr[0];
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Max is: " + max);
    }

    public static void findPrimeInArray(int[] arr, int number) {
        boolean flag = true;
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                flag = false;
            }
        }
        if (flag){
            System.out.println(number + ": is prime ");
        }
        else {
            System.out.println("is not prime");
        }
    }
}
