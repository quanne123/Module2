package controllers;

import java.util.Scanner;

public class FacilityController {
    public static void facilityManagement(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1: Display list facility");
        System.out.println("2: Add new Facility");
        System.out.println("3: Display list facility maintenance");
        System.out.println("4: Return main menu");
        int choice = Integer.parseInt(sc.nextLine());

    }
}
