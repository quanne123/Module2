import java.util.Arrays;
import java.util.Scanner;

public class DemSoKyTuTrongChuoi {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập chiều dài cột");
            int col = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập chiều dài hàng");
            int row = Integer.parseInt(scanner.nextLine());
            int[][] arr = new int[col][row];
            int sum = 0;
            System.out.println("Cột cần tính tổng");
            int num = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < col; i++) {
                for (int j = 0; j < row; j++) {
                    System.out.println("Nhập phần tử [" + i + "]" + "[" + j + "]");
                    arr[i][j] = Integer.parseInt(scanner.nextLine());
                }
            }
            System.out.println(Arrays.deepToString(arr));
            for (int i = 0; i < col; i++) {
                for (int j = 0; j < row; j++) {
                    if ( num == i){
                        sum += arr[i][j];
                    }
                }
            }
            System.out.println("Tổng độ dài cột "+num+" là:"+sum);
        }
    }
