package onlineShop.model;

import onlineShop.enums.ProductsType;

import java.util.Objects;

public class Product {
    private String productId;
    private String productName;
    private String productDescription;
    private double productPrice;
    private int stockQty;
    private ProductsType type;

    public Product(String productId, String productName, String productDescription, double productPrice, int stockQty, ProductsType type) {
        this.productId = productId;
        this.productName = productName;
        this.productDescription = productDescription;
        this.productPrice = productPrice;
        this.stockQty = stockQty;
        this.type = type;
    }

    public Product() {
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getStockQty() {
        return stockQty;
    }

    public void setStockQty(int stockQty) {
        this.stockQty = stockQty;
    }

    public ProductsType getType() {
        return type;
    }

    public void setType(ProductsType type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;

        if (Double.compare(productPrice, product.productPrice) != 0) return false;
        if (stockQty != product.stockQty) return false;
        if (!Objects.equals(productId, product.productId)) return false;
        if (!Objects.equals(productName, product.productName)) return false;
        if (!Objects.equals(productDescription, product.productDescription))
            return false;
        return type == product.type;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = productId != null ? productId.hashCode() : 0;
        result = 31 * result + (productName != null ? productName.hashCode() : 0);
        result = 31 * result + (productDescription != null ? productDescription.hashCode() : 0);
        temp = Double.doubleToLongBits(productPrice);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + stockQty;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", productDescription='" + productDescription + '\'' +
                ", productPrice=" + productPrice +
                ", stockQty=" + stockQty +
                ", type=" + type +
                '}';
    }

}
