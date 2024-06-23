package ss12.bai_tap.use_arraylist_and_linkedlist.array_list.linkedlist.controller;

import ss12.bai_tap.use_arraylist_and_linkedlist.array_list.linkedlist.molde.Product;
import ss12.bai_tap.use_arraylist_and_linkedlist.array_list.linkedlist.service.ProductManager;


public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Product product = new Product(1, "Iphone", 100, 1000);
        productManager.addLast(product);
        Product product2 = new Product(2, "Samsung", 50, 800);
        productManager.addLast(product2);
        Product product3 = new Product(3, "Alibaba", 20, 200);
        productManager.addLast(product3);
        productManager.printList();
        productManager.remove(0);
        productManager.printList();

//        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            ViewProduct.isDisplayMenu();
//            int choice = scanner.nextInt();
//            scanner.nextLine();
//            switch (choice) {
//                case 1:
//                    ViewProduct.addNewProduct(scanner, productManager);
//                    break;
//                case 2:
//                    ViewProduct.updateProductCurrentById(scanner, productManager);
//                    break;
//                case 3:
//                    ViewProduct.deleteProductById(scanner, productManager);
//                    break;
//                case 4:
//                    productManager.displayProducts();
//                    break;
//                case 5:
//                    ViewProduct.sortProduct(scanner, productManager);
//                    break;
//
//                case 0:
//                    System.out.println("Goodbye!");
//                    System.exit(0);
//                default:
//                    System.out.println("Invalid choice");
//            }
//
//        }

    }




}
