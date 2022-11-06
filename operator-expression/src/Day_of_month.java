import java.util.Scanner;

public class Day_of_month {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which month that you want to count days? ");
        int month = scanner.nextInt();
        String daysInMonth;
        switch (month){
            case 2: //Nếu tháng được nhập là tháng 2, thì có 28 ngày
               // System.out.println("The month '2' has 28 or 29 days!");
                daysInMonth = "28";
                break;
            case 1: // Nếu tháng nhập là 1,3,5,7,8,10,12 thì có 31 ngày
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInMonth = "31";
               // System.out.println("The month '" + month + "' has 31 days!");
                break;
            case 4: //Nếu tháng nhập vào là 4,6,9,11 thì có 30 ngày
            case 6:
            case 9:
            case 11:
                daysInMonth = "30";
                //System.out.println("The month '" + month + "' has 30 days!");
                break;
            default:
                daysInMonth = "";
             //   System.out.println("Invalid input!");
        }
        if (!daysInMonth.equals("")) System.out.printf("The month '%d'has %s days!",month,daysInMonth);
        else System.out.println("Invalid input!");
    }
}
