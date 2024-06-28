package ss17.bai_tap.product_manager;

import ss17.thuc_hanh.read_write_binary.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<Product>();

        Scanner scanner = new Scanner(System.in);
        File file = null;
        try {
            file = new File("src/ss17/bai_tap/product_manager/product.bin");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try{
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (List<Product>) ois.readObject();
            fis.close();
            ois.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        while(true){
            System.out.println("Menu Product");
            System.out.println("1. Add Product");
            System.out.println("2. Display Product");
            System.out.println("3. Search Product");
            System.out.println("4. Exit");
            System.out.println("Enter your choice");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 1:
                    System.out.println("Enter product id");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter product name");
                    String name = scanner.nextLine();
                    System.out.println("Enter product price");
                    double price = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Enter product company");
                    String company = scanner.nextLine();
                    System.out.println("Enter product description");
                    String description = scanner.nextLine();
                    Product product = new Product(id, name, price, company, description);
                    products.add(product);
                    try {
                        FileOutputStream fos = new FileOutputStream(file);
                        ObjectOutputStream oos = new ObjectOutputStream(fos);
                        oos.writeObject(products);
                        oos.close();
                        fos.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                    case 2:
                        List<Product> products1 = new ArrayList<Product>();
                        try{
                            FileInputStream fis = new FileInputStream(file);
                            ObjectInputStream ois = new ObjectInputStream(fis);
                            products1 = (List<Product>) ois.readObject();
                            fis.close();
                            ois.close();
                        }catch(Exception ex){
                            ex.printStackTrace();
                        }
                        for (Product readProduct : products1) {
                            System.out.println(readProduct);
                        }
                        break;
                        case 3:
                            System.out.println("Enter search product id");
                            int searchId = scanner.nextInt();
                            scanner.nextLine();
                            List<Product> productsSearch = new ArrayList<Product>();
                            try{
                                FileInputStream fis = new FileInputStream(file);
                                ObjectInputStream ois = new ObjectInputStream(fis);
                                productsSearch = (List<Product>) ois.readObject();
                                fis.close();
                                ois.close();
                            }catch(Exception ex){
                                ex.printStackTrace();
                            }
                            boolean searchFound = false;
                            for (Product productSearch : productsSearch) {
                                if(productSearch.getId() == searchId){
                                    System.out.println("Have product have id " + productSearch.getId());
                                    searchFound = true;
                                    System.out.println(productSearch);
                                }
                            }
                            if(!searchFound){
                                System.out.println("Product not found");
                            }
                            break;
                            case 4:
                                scanner.close();
                                System.exit(0);
                default:
                    System.out.println("Invalid choice");



            }
        }
    }
}
