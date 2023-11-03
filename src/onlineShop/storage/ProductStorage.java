package onlineShop.storage;

import onlineShop.enums.ProductsType;
import onlineShop.exceptions.OutOfStockException;
import onlineShop.model.Product;

public class ProductStorage {
    private Product[] products = new Product[10];
    int size;

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(products[i]);
        }
    }

    public void addProducts(Product product) {
        if (size == products.length) {
            extend();
        }
        products[size++] = product;
    }

    public ProductsType getType(String productType) {
        if (productType.equals(ProductsType.ELECTRONICS.name()) ||
                productType.equals(ProductsType.CLOTHING.name()) ||
                productType.equals(ProductsType.BOOKS.name())) {
            return ProductsType.valueOf(productType);
        }
        return null;
    }

    public void removeProduct(String productId) {
        for (int i = 0; i < size; i++) {
            if (products[i].getProductId().equals(productId)) {
                products[i] = products[i + 1];
            }
        }
        size--;
    }

    public Product getById(String productId) {
        for (int i = 0; i < size; i++) {
            if (products[i].getProductId().equals(productId)) {
                return products[i];
            }
        }
        return null;
    }

    public int getProductQty(String id, int qty) throws OutOfStockException {
        for (int i = 0; i < size; i++) {
            if (products[i].getProductId().equals(id) && products[i].getStockQty() >= qty) {
                return qty;
            }
        }
        throw new OutOfStockException ("Out of stock");
    }

    private void extend() {
        Product[] tmp = new Product[products.length + 10];
        System.arraycopy(products, 0, tmp, 0, products.length);
    }

}
