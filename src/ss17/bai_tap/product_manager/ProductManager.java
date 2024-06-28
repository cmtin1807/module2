package ss17.bai_tap.product_manager;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ProductManager implements Serializable {
    private static final long serialVersionUID = -9223365651070458532L;

    private List<Product> productManager;
    public ProductManager() {
        productManager = new ArrayList<>();
    }

    public void add(Product product) {
        productManager.add(product);
    }
}
