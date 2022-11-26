import java.util.Arrays;

public class OnTap4 {
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length -1; i++) {
            for (int j = arr.length-1; j>i; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }
    public static void selectionSort( int[] arr){
        int min;
        for (int i = 0; i < arr.length-1 ; i++) {
            min = i;
            for (int j=i+1 ; j< arr.length ; j++) {
                if (arr[j] < arr[min]){
                    min = j;
                }
                if (min != i){
                    int temp = arr[min];
                    arr[min] = arr[i];
                    arr[i] = temp;
                }

            }

        }
    }



    public static void main(String[] args) {
        int[] arr = {11,5,3,4,6};
        sort(arr);
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}






