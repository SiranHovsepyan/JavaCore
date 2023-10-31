package onlineShop.storage;

import onlineShop.enums.ProductsType;
import onlineShop.model.Product;

public class ProductStorage {
    private Product[] products =new Product[10];
    int size;
    public  void  print(){
        for (int i = 0; i < size; i++) {
            System.out.println(products[i]);
        }
    }

    public ProductsType getType(String productType) {
        return null;
    }
}
