import java.util.Scanner;

public class TimGiaTriLonNhat {
    public static void main(String[] args) {
        int size;
        int [] arr;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a size");
            size = sc.nextInt();
            if(size > 20){
                System.out.print("Size not exceed 20");
            }
        }while (size > 20);
        arr = new int [size];
        int i = 0;
        while (i < arr.length){
            System.out.print("enter element" + (i +1) + " : ");
            arr[i] = sc.nextInt();
            i++;
        }
        System.out.print("Property list: ");
        for (int j=0;j<arr.length;j++){
            System.out.print(arr[j] + "\t");
        }
        int max = arr[0];
        int index = 1;
        for (int j = 0;j < arr.length;j++){
            if (arr[j] > max){
                max = arr[j];
                index = j + 1;
            }
        }
        System.out.println("Max is: " + max + " o vi tri" + index);
    }
}
