
    import java.util.Arrays;
import java.util.Scanner;

    public class TimSoLonNhatMang2Chieu {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập chiều dài cột ");
            int col = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập chiều dài hàng");
            int row = Integer.parseInt(scanner.nextLine());
            int [][] array = new int[col][row];
            int indexI = 0;
            int indexJ =0;
            for (int i = 0; i < col; i++) {
                for (int j = 0; j < row; j++) {
                    System.out.println("Nhập phần tử mảng vị trí ["+i+"]"+"["+j+"]" );
                    array[i][j] = Integer.parseInt(scanner.nextLine());
                }
            }
            System.out.println(Arrays.deepToString(array));
            int max = array[0][0];
            for (int i = 0; i < col; i++) {
                for (int j = 0; j < row; j++) {
                    if (array[i][j]>max){
                        max = array[i][j];
                        indexI = i;
                        indexJ = j;
                    }
                }
            }
            System.out.println("Giá trị max là: "+max +" tại vi trí cột "+ indexI +" vị trí hàng "+ indexJ);
        }
    }

