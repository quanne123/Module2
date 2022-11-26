package Bai1_Stack;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
import java.util.Stack;

public class StackDaoNguocChuoi {
    public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Nhập vào chuỗi cần đảo");
            String input = scanner.nextLine();
            String arr[]=input.split(" ");
            System.out.println(Arrays.toString(arr));
            Stack<String> list = new Stack<>();
            for (int i = 0; i < arr.length; i++) {
                list.push(arr[i]);
            }
            int size=list.size();
            System.out.println("Chuỗi sau khi đảo");
            for (int i = 0; i <size; i++) {
                System.out.print(list.pop()+" ");
            }
        }
    }
