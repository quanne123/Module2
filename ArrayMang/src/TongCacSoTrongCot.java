import java.util.Arrays;
import java.util.Scanner;

public class TongCacSoTrongCot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row, column;
        System.out.println("nhập row");
        row = Integer.parseInt(sc.nextLine());
        System.out.println("nhập column");
        column = Integer.parseInt(sc.nextLine());
        int[][] arr = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println("nhập các phần tử của row");
                arr[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        System.out.println("mảng bạn vừa nhập là ");
        System.out.println(Arrays.deepToString(arr));

        int index;
        int sum = 0;
        System.out.println("nhập số cột muốn tính tổng trong ma trận");
        index = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j == index) {
                    sum += arr[i][j];
                    break;
                }
            }
        }
        System.out.println("tổng của cột " + index + " là : " + sum);
    }
}

