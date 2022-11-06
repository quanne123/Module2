import java.util.Scanner;

public class read_number_into_words {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = Integer.parseInt(scanner.nextLine());

        String[] hundredNames = {
                "",
                " one hundred",
                " two hundred",
                " three hundred",
                " four hundred",
                " five hundred",
                " six hundred",
                " seven hundred",
                " eight hundred",
                " nine hundred"
        };

        String[] tensNames = {
                "",
                " ten",
                " twenty",
                " thirty",
                " forty",
                " fifty",
                " sixty",
                " seventy",
                " eighty",
                " ninety"
        };

        String[] onesNames = {
                "",
                " one",
                " two",
                " three",
                " four",
                " five",
                " six",
                " seven",
                " eight",
                " nine",
                " ten",
                " eleven",
                " twelve",
                " thirteen",
                " fourteen",
                " fifteen",
                " sixteen",
                " seventeen",
                " eighteen",
                " nineteen"
        };

        if (number == 0) {
            System.out.println("zero");
        } else if (number < 20) {
            System.out.println(onesNames[number]);
        } else if (number < 100) {
            int tens = number / 10;
            int ones = number - tens * 10;

            System.out.println(tensNames[tens] + onesNames[ones]);
        } else if (number < 1000) {
            int hundred = number / 100;
            int tens = (number - hundred * 100) / 10;
            int ones = (number - hundred * 100) - tens * 10;

            System.out.println(hundredNames[hundred] + tensNames[tens] + onesNames[ones]);
        } else System.out.println("Out of ability");
    }
}