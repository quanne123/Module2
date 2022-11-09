import java.util.Scanner;

public class ThuatToan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] myArray= {8,7,2,5,3,1};
        int x =10;
        for (int i = 0;i<myArray.length ;i++){
            for (int j = i +1;j<myArray.length;j++){
                if ((myArray[i] + myArray[j]) == x){
                    System.out.println(myArray[i] +"," + myArray[j]);

                }
            }
        }
        System.out.println("Khong co cap nao giong nhau ");

    }
}
