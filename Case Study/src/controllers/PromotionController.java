package controllers;

import java.util.Scanner;

public class PromotionController {
    public static void promotionManagement(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Display list customers use service");
        System.out.println("2.Display list customers get voucher");
        System.out.println("3.Return main menu");
        int choice = Integer.parseInt(sc.nextLine());

    }
}
