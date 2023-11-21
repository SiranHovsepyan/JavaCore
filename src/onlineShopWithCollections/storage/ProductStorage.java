package onlineShopWithCollections.storage;

import onlineShopWithCollections.enums.ProductsType;
import onlineShopWithCollections.exceptions.OutOfStockException;
import onlineShopWithCollections.model.Product;

import java.util.HashSet;
import java.util.Set;

public class ProductStorage {
    Set<Product> products = new HashSet<>();

    public void print() {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public void addProducts(Product product) {
        products.add(product);
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
        for (Product product : products) {
            if (product.getProductId().equals(productId)){
                products.remove(product);
            }
        }
    }

    public Product getById(String productId) {
        for (Product productById : products) {
            if (productById.getProductId().equals(productId)){
                return productById;
            }
        }
        return null;
    }

    public int getProductQty(String id, int qty) throws OutOfStockException {
        for (Product productQty : products) {
            if (productQty.getProductId().equals(id)&& productQty.getStockQty()>=qty){
                return qty;
            }
        }
        throw new OutOfStockException ("Out of stock");
    }


}
