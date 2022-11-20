import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
        public static void main(String[] args) {
            Stack<String> newString = new Stack<>();
            Queue<String> newQueue = new ArrayDeque<>();
            System.out.println("enter your string");
            Scanner scanner = new Scanner(System.in);
            String inputString = scanner.nextLine();
            String[] array = inputString.toLowerCase().split("");
            for (int i = 0; i < array.length; i++) {
                newString.push(array[i]);
            }

            for (int i = 0; i < array.length; i++) {
                newQueue.add(array[i]);
            }

            int size = newQueue.size();
            boolean flag = true;
            for (int i = 0; i < size; i++) {
                if (!newQueue.poll().equals(newString.pop())) {
                    flag = false;
                } else {
                    flag = true;
                }

            }
            if (flag) {
                System.out.println("String is Palindrome");
            } else {
                System.out.println("String is not Palindrome");
            }
        }
    }
