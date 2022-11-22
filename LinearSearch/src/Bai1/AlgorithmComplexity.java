package Bai1;

import java.util.Scanner;

public class AlgorithmComplexity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        int[] frequentChar = new int[255];
        int lengthInputString = inputString.length();

        for (int i = 0; i < lengthInputString; i++) {
            int ascii = inputString.charAt(i);

            frequentChar[ascii] += 1;
        }

        int maxCharAppeared = 0;

        char character = (char) 255;

        for (int i = 0; i < 255; i++) {
            if (frequentChar[i] > maxCharAppeared) {
                maxCharAppeared = frequentChar[i];
                character = (char) i;
            }
        }

        System.out.println("The most appearing letter is '" + character + "' with a frequency of " + maxCharAppeared + " times");
    }
}
