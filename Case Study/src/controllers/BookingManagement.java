package controllers;

import java.util.Scanner;

public class BookingManagement {
    public static void BookingManagement(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1: Add new booking");
        System.out.println("2: Display list booking");
        System.out.println("3: Return main menu ");
        int choice = Integer.parseInt(sc.nextLine());
    }
}
