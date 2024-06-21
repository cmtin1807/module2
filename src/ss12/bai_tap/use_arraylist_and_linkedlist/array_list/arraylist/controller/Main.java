package ss12.bai_tap.use_arraylist_and_linkedlist.array_list.arraylist.controller;

import ss12.bai_tap.use_arraylist_and_linkedlist.array_list.arraylist.molde.Product;
import ss12.bai_tap.use_arraylist_and_linkedlist.array_list.arraylist.service.ProductManager;
import ss12.bai_tap.use_arraylist_and_linkedlist.array_list.arraylist.view.ViewProduct;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Product product = new Product(1, "Iphone", 100, 1000);
        productManager.addProduct(product);
        Product product2 = new Product(2, "Samsung", 50, 800);
        productManager.addProduct(product2);
        Product product3 = new Product(3, "Alibaba", 20, 200);
        productManager.addProduct(product3);
        productManager.displayProducts();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            ViewProduct.isDisplayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    ViewProduct.addNewProduct(scanner, productManager);
                    break;
                case 2:
                    ViewProduct.updateProductCurrentById(scanner, productManager);
                    break;
                case 3:
                    ViewProduct.deleteProductById(scanner, productManager);
                    break;
                case 4:
                    productManager.displayProducts();
                    break;
                case 5:
                    ViewProduct.sortProduct(scanner, productManager);
                    break;

                case 0:
                    System.out.println("Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }

        }

    }




}
