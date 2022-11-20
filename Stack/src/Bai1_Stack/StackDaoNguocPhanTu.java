package Bai1_Stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class StackDaoNguocPhanTu {
    public static void main(String[] args) {
        int[] arrInterger = new int[4];
        Scanner sc = new Scanner(System.in);
        Stack<Integer> numbers = new Stack<>();
        int size = arrInterger.length;
        for (int i = 0; i <size ; i++) {
            System.out.println("Enter elements" +(i+1) + "trong mang muon dao nguoc");
            arrInterger[i]=Integer.parseInt(sc.nextLine());
        }
        System.out.println("Mang nhap vao" + Arrays.toString(arrInterger));
        for (int i = 0; i <size ; i++) {
            numbers.push(arrInterger[i]);
        }
        for (int i = 0; i <size ; i++) {
            arrInterger[i] = numbers.pop();
        }

        System.out.println("Mang dao nguoc la: " + Arrays.toString(arrInterger));
    }
}
