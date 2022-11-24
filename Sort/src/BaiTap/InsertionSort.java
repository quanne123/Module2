package BaiTap;

public class InsertionSort {
    public static void main(String[] args) {
    int arr[] = {1,3,2,8,4,7};
        System.out.println("Mang ban dau: ");
        printArray(arr);
        InsertionSort ob = new InsertionSort();
        ob.sort(arr);
        System.out.println("Mang sau khi sap xep: ");
        printArray(arr);
    }
        void sort(int arr[]){
            int size = arr.length;
            for (int i = 1; i <size; i++) {
                int key = arr[i];
                int j =i -1;
                while (j>=0 && arr[j] > key){
                    arr[j+1] =arr[j];
                    j = j-1;
                }
                arr[j +1] = key;

            }
        }
        public static void printArray(int arr[]){
        int size = arr.length;
            for (int i = 0; i <size ; i++) {
                System.out.println(arr[i] + "");
            }
            System.out.println();

    }
}
