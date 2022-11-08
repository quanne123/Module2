import java.util.Scanner;

public class TImSoNhoNhat {
    public static void main(String[] args) {


        int size;
        int[] arr;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a size ");
            size = sc.nextInt();
            if (size > 20) ;
            System.out.print("Size should not exceed 20");
        } while (size > 20);
        arr = new int[size];
        int i = 0;
        while (i < arr.length) {
            System.out.print("Enter element " + (i + 1) + " :");
            arr[i] = sc.nextInt();
            i++;
        }
        System.out.print("Propety List :");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }
        int min = arr[0];
        int index = 1;
        for (int j = 0; j < arr.length; j++) {
            if (min > arr[j]) {
                min = arr[j];
                index = j + 1;
            }
        }
        System.out.println("Min ís : " + min + " o vi tri: " + index);
    }
}
