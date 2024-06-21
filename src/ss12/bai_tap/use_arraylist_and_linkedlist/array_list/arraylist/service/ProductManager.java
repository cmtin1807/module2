package ss12.bai_tap.use_arraylist_and_linkedlist.array_list.arraylist.service;

import ss12.bai_tap.use_arraylist_and_linkedlist.array_list.arraylist.molde.Product;

import java.util.*;

public class ProductManager {
    List<Product> productList;

    public ProductManager() {
        productList = new ArrayList<Product>();
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void removeProduct(int id) {
        if (!productList.isEmpty()) {
            for (int i = 0; i < productList.size(); i++) {
                if (productList.get(i).getId() == id) {
                    productList.remove(productList.get(i));
                    System.out.println("Removed product: " + productList.get(i));
                }
            }
        }

    }
    public boolean checkId(int id) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                return true;
            }
        }
        return false;
    }

    public void updateProduct(int id, Product product) {
        if (!productList.isEmpty()) {
            for (int i = 0; i < productList.size(); i++) {
                if (productList.get(i).getId() == id) {
                    productList.set(i, product);
                }
            }

        }
    }

    public Product getProduct(String name) {
        for (Product product : productList) {
            if (product.getProductName().equals(name)) {
                return product;
            }

        }
        return null;
    }

    public void sortProductsByName() {
        Collections.sort(productList);
    }

    public void sortProductsByPriceAscending() {
        Comparator comparator = new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getProductPrice() > o2.getProductPrice()) {
                    return 1;
                }
                if (o1.getProductPrice() < o2.getProductPrice()) {
                    return -1;
                }
                return 0;
            }
        };
        Collections.sort(productList, comparator);
    }

    public void sortProductsByPriceDescending() {
        Comparator comparator = new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getProductPrice() < o2.getProductPrice()) {
                    return 1;
                }
                if (o1.getProductPrice() > o2.getProductPrice()) {
                    return -1;
                }
                return 0;
            }
        };
        Collections.sort(productList, comparator);
    }

    public void displayProducts() {
        for (Product product : productList) {
            System.out.println(product);
        }
    }
}
