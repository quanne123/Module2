import java.util.Arrays;
import java.util.Scanner;


public class XoaPhanTuCuaMang {
    public static void main(String[] args) {
        int size;
        int[] arr;
        int input;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        size = sc.nextInt();
        arr = new int[size];
        for (int i =0;i<size;i++){
            System.out.print("Enter element " + (i + 1) + " :");
            arr[i] = sc.nextInt();
        }


        System.out.println("My array input" + Arrays.toString(arr));
        System.out.println("Enter your choice ");
        input = sc.nextInt();
        int index = -1;
        for (int i =0;i<size;i++){
            if (input==arr[i]){
                index = i;

            }
        }if (index == -1){
            System.out.println(input+ "is not include ");
        }
        else {
            for (int i = index;i <size-1;i++){
                arr[i]=arr[i+1];

            } arr[size-1] = 0;
            System.out.println(input + "is include");
            for (int i =0; i< size;i++){
                System.out.println(arr[i]);
            }
        }

    }
}
