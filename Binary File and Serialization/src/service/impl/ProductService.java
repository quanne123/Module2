package Service.impl;

import Model.Product;
import Service.IProductService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    private static final Scanner sc = new Scanner(System.in);

    public void addProduct() {
        System.out.println("Enter id");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Enter name of product: ");
        String name = sc.nextLine();
        System.out.println("Enter producer of product");
        String producer = sc.nextLine();
        System.out.println("Enter price of product:");
        double price = Double.parseDouble(sc.nextLine());

        List<Product> products = readFile();
        products.add(new Product(id,name,producer,price));

        File file = new File("src/Data/Product.csv");
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(products);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
//                assert fileOutputStream != null;
                fileOutputStream.close();
//                assert objectOutputStream != null;
                objectOutputStream.close();

            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
    public List<Product> readFile() {
        List<Product> products = new ArrayList<>();
        File file = new File("src/Data/Product.csv");
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            if (file.length() > 0){
                fileInputStream = new FileInputStream(file);
                objectInputStream = new ObjectInputStream(fileInputStream);
                products = (List<Product>)  objectInputStream.readObject();

            }
        } catch (IOException e) {
           e.printStackTrace();
        } catch (ClassNotFoundException e) {
           e.printStackTrace();
        }finally {
            try {
               fileInputStream.close();
               objectInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return products;
    }
    public void displayProduct() {
        List<Product> products = readFile();
        System.out.println("List of Product: ");
        for (Product product : products){
            System.out.println(product);
        }
    }

    @Override
    public void searchProduct() {

    }

    public void search() {
        List<Product> products = readFile();
        System.out.println("Enter id: ");
        String id = sc.nextLine();

        for (Product product : products) {
            if (products.size() == 0) {
                System.out.println("is not a List");
            }
            else {
                System.out.println(product);
            }
        }
        System.out.println("Can't search the product:");
    }
}
