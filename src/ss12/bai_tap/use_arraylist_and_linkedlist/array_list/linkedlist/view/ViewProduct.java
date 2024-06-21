package ss12.bai_tap.use_arraylist_and_linkedlist.array_list.linkedlist.view;

import ss12.bai_tap.use_arraylist_and_linkedlist.array_list.linkedlist.molde.Product;
import ss12.bai_tap.use_arraylist_and_linkedlist.array_list.linkedlist.service.ProductManager;

import java.util.Scanner;

public class ViewProduct {
    public static void sortProduct(Scanner scanner, ProductManager productManager) {
        boolean isSort = true;
        while (isSort){
            System.out.println("1. Sort Product By Name: ");
            System.out.println("2. Sort Product By Price Descending: ");
            System.out.println("3. Sort Product By Price Ascending: ");
            System.out.println("4. Exit: ");
            System.out.println("Enter your choice: ");
            int choice2 = scanner.nextInt();
            scanner.nextLine();
            switch (choice2) {
                case 1:
                    productManager.sortProductsByName();
                    productManager.displayProducts();
                    break;
                case 2:
                    productManager.sortProductsByPriceDescending();
                    productManager.displayProducts();
                    break;
                case 3:
                    productManager.sortProductsByPriceAscending();
                    productManager.displayProducts();
                    break;
                case 4:
                    isSort = false;
                    break;

                default:
                    System.out.println("Invalid choice");


            }
        }
    }

    public static void deleteProductById(Scanner scanner, ProductManager productManager) {
        System.out.println("Enter product id: ");
        int id2 = scanner.nextInt();
        productManager.removeProduct(id2);
    }

    public static void updateProductCurrentById(Scanner scanner, ProductManager productManager) {
        boolean isUpdate = true;
        while (isUpdate) {
        System.out.println("Enter product id: ");
        int id1 = scanner.nextInt();
        if (productManager.checkId(id1)) {
            System.out.println("Enter product name: ");
            String name1 = scanner.next();
            scanner.nextLine();
            System.out.println("Enter product price: ");
            int price1 = scanner.nextInt();
            System.out.println("Enter product quantity: ");
            int quantity1 = scanner.nextInt();
            productManager.updateProduct(id1, new Product(name1, price1, quantity1));
            isUpdate = false;
        }{
            System.out.println("id does not exist: ");
        }
    }}
    public static void addNewProduct(Scanner scanner, ProductManager productManager) {
        System.out.println("Enter product id: ");
        int id = scanner.nextInt();
        System.out.println("Enter product name: ");
        String name = scanner.next();
        scanner.nextLine();
        System.out.println("Enter product price: ");
        int price = scanner.nextInt();
        System.out.println("Enter product quantity: ");
        int quantity = scanner.nextInt();
        Product products = new Product(id, name, price, quantity);
        productManager.addProduct(products);
    }
    public static void isDisplayMenu() {
        System.out.println("Menu Product");
        System.out.println("1. Add Product");
        System.out.println("2. Update Product");
        System.out.println("3. Delete Product");
        System.out.println("4. Display Product");
        System.out.println("5. Sort Product");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
    }
}
