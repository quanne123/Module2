package controller;

import service.IProductService;
import service.impl.ProductService;

import java.util.Scanner;

public class ProductController {
    private static final Scanner sc = new Scanner(System.in);
    private final IProductService product = new ProductService();

    public void menuChoice(){
        while(true){
            System.out.println("-------Product Management-------");
            System.out.println("1.add new Product: ");
            System.out.println("2. display product: ");
            System.out.println("3. Search product:");
            System.out.println("4: Exit");
            System.out.println("Your choice: ");
            int choice =Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    product.addProduct();
                     break;
                case 2:
                    product.displayProduct();
                    break;
                case 3:
                    product.searchProduct();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Enter again: ");
                    break;
            }
        }
    }
}
