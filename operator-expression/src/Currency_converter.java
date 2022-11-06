import java.util.Scanner;

public class Currency_converter {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your USD:");
        usd = sc.nextDouble();
        double convert = usd *23000;
        System.out.print("Value vnd:" + convert);

    }
}
