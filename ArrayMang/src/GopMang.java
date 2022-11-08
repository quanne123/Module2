
import java.util.Arrays;
import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        int[] arr1 = new int[3];
        int[] arr2 = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("nhập phần tử thứ " + (i + 1) + "của mảng 1 ");
            arr1[i] = Integer.parseInt(sc.nextLine());
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("nhập phần tử thứ " + (i + 1) + "của mảng 2 ");
            arr2[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("mảng 1 là " + Arrays.toString(arr1));
        System.out.println("mảng 2 là " + Arrays.toString(arr2));

        int[] arr3 = new int[8];
        int count = 0 ;
        for (int i = 0; i < 3; i++) {
            arr3[i] = arr1[i];
            count +=1 ;
        }
        System.out.println(Arrays.toString(arr3));
        for (int i = 0; i < 5; i++) {
            arr3[i+3] = arr2[i];
            count +=1 ;
        }
        System.out.print("mảng sau khi ghép là : ");
        System.out.println(Arrays.toString(arr3));
    }
}