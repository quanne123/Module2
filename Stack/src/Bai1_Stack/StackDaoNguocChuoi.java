package Bai1_Stack;

import java.sql.SQLOutput;
import java.util.Objects;
import java.util.Scanner;
import java.util.Stack;

public class StackDaoNguocChuoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> wStack = new Stack<>();
        System.out.println("Nhap vao chuoi muon chuyen doi");
        String any = sc.nextLine();
        String [] words = any.split(" ");
        for (int i = 0; i <words.length ; i++) {
            if(!Objects.equals(words[i],""));
            wStack.push(words[i]);

        }
        int sizeWStack = wStack.size();
        System.out.println("Chuoi dao nguoc la: " );
        for (int i = 0; i <sizeWStack ; i++) {
            System.out.println(wStack.pop()+"");

        }

    }
}
