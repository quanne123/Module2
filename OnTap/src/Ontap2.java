import java.util.Arrays;
import java.util.Scanner;

public class Ontap2 {
    public static void main(String[] args) {
        int[] arr;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao phan tu cua mang");
        int number = Integer.parseInt(sc.nextLine());
        arr = new int[number];
        for (int i = 0; i <number ; i++) {
            System.out.println("Nhap vao phan tu thu i: " + (i +1));
            arr[i]= sc.nextInt();


        }
        System.out.println(Arrays.toString(arr));
        findMax(arr);
        Sort(arr,number);
    }

    public static void findMax(int arr[]){
        int max = arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if (max < arr[i]){
                max = arr[i];
            }

        }
        System.out.println("phan tu lon nhat trong Mang la: " + max);
    }
    public static void Sort (int arr[], int number){
        for (int i = 0; i <number ; i++) {
            for (int j = 0; j <number -1 ; j++) {
                if (arr[j] > arr[j+1]){
                    int temp =arr[j];
                            arr[j] = arr[i];
                            arr[i] = temp;
                }

            }

        }
        System.out.println(Arrays.toString(arr));
//        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//        System.out.println("The length of the txt string is: " + txt.length());
        String txt = "Please locate where 'locate' occurs!";
        System.out.println(txt.indexOf("locate")); // Outputs 7
    }

}
