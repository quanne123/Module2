package BaiTap;

import java.util.Arrays;

public class InsertSort {
   static int[] arr = {7,8,5,4,3,2};

    static void insertSort(int[] arr){
        int pos, x;
        for (int i = 1; i < arr.length ; i++) {
            pos = 1;
            x = arr[i];
            while (pos > 0 && x > arr[pos-1]){
                arr[pos] = arr [ pos -1];
                pos--;
            }
            arr[pos] = x;
        }
    }

    public static void main(String[] args) {

         insertSort(arr);
//        System.out.println("Mang ban dau la: " );
//        System.out.println(Arrays.toString(arr));
//        insertSort(arr);
//        System.out.println("Mang sau khi sap xep la");
//        System.out.println(Arrays.toString(arr));
        for (int element : arr) {
            System.out.println(element);
        }
        System.out.println(Arrays.toString(arr));
    }
}
