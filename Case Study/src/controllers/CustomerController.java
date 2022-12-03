package controllers;

import java.util.Scanner;

public class CustomerController {
    public static void CustomerManagement() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1: Display list customers");
        System.out.println("2: Add new customer");
        System.out.println("3: Edit customer");
        System.out.println("4: Return main menu");
        int choice = Integer.parseInt(sc.nextLine());

    }
}
