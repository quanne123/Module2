
import java.util.Scanner;

public class TinhTongCacSoDuongCheoMaTran {
    public static void main(String[] args) {


        int n;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao bac cua ma tran: ");
        n = sc.nextInt();
        int A[][] = new int [n][n];
        System.out.println("Nhap cac phan tu cho ma tran :");
        for (int i = 0;i<n;i++){
            for (int j = 0;j<n;j++){
                System.out.print("A[" + i + "][" + j + "] =");
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("ma tran A vua nhap: ");
        for (int i =0;i<n;i++){
            for (int j =0;j<n;j++){
                System.out.println(A[i][j] + "\t");
            }
            System.out.println("\n");
        }
        for (int i =0;i<n;i++){
            for (int j = 0;j<n;j++){
                if(i == j){
                    sum += A[i][j];
                }
            }
        }
        System.out.println("Tong cac phan tu nam tren duong cheo chinh = " + sum);
    }
}
