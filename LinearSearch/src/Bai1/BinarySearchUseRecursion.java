package Bai1;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchUseRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");

        int lengthArrayInteger = Integer.parseInt(scanner.nextLine());

        while (lengthArrayInteger <= 0) {
            System.out.print("Length of the array must be greater than 0, re-enter: ");
            lengthArrayInteger = Integer.parseInt(scanner.nextLine());
        }
        int[] arrayInteger = new int[lengthArrayInteger];

        for (int i = 0; i < lengthArrayInteger; i++) {
            arrayInteger[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.println("Original array: " + Arrays.toString(arrayInteger));

        Arrays.sort(arrayInteger);

        System.out.println("Sorted array: " + Arrays.toString(arrayInteger));
        System.out.print("Enter value to find: ");
        int searchValue = Integer.parseInt(scanner.nextLine());

        System.out.println("The value to find at index: "
                + binarySearch(arrayInteger, searchValue, 0, lengthArrayInteger - 1));
    }

    public static int binarySearch(int[] array, int searchValue, int left, int right) {
        if (right >= left) {
            int middle = (right + left) / 2;
            if (array[middle] == searchValue) {
                return middle;
            }
            if (searchValue > array[middle]) {
                return binarySearch(array, searchValue, middle + 1, right);
            }
            return binarySearch(array, searchValue, left, middle - 1);
        }
        return -1;
    }
}
