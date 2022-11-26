package bai2_Stack;

import java.util.*;

public class CountCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter string: ");
        String document = scanner.nextLine();

        String[] arrayDocument = document.split(" ");
        Map<String, Integer> numberWord = new TreeMap<>();
        int value;

        for (String item : arrayDocument) {
            value = 0;
            for (String s : arrayDocument) {
                if (Objects.equals(item, s)) {
                    value++;
                }
            }
            if (!Objects.equals(item, "")) {
                numberWord.put(item, value);
            }
        }
        System.out.println(numberWord);
    }
}


