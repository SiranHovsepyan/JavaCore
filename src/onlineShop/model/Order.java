package onlineShop.model;

import onlineShop.enums.OrderStatus;
import onlineShop.enums.PaymentMethod;

import java.util.Date;
import java.util.Objects;

public class Order {
    private String orderId;
    private User user;
    private Product product;
    private Date date;
    private double orderPrice;
    private OrderStatus orderStatus;
    private int qty;
    private PaymentMethod paymentMethod;

    public Order(String orderId, User user, Product product, Date date, double orderPrice, OrderStatus orderStatus, int qty, PaymentMethod paymentMethod) {
        this.orderId = orderId;
        this.user = user;
        this.product = product;
        this.date = date;
        this.orderPrice = orderPrice;
        this.orderStatus = orderStatus;
        this.qty = qty;
        this.paymentMethod = paymentMethod;
    }

    public Order() {
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(double orderPrice) {
        this.orderPrice = orderPrice;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order order)) return false;

        if (Double.compare(orderPrice, order.orderPrice) != 0) return false;
        if (qty != order.qty) return false;
        if (!Objects.equals(orderId, order.orderId)) return false;
        if (!Objects.equals(user, order.user)) return false;
        if (!Objects.equals(product, order.product)) return false;
        if (!Objects.equals(date, order.date)) return false;
        if (orderStatus != order.orderStatus) return false;
        return paymentMethod == order.paymentMethod;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = orderId != null ? orderId.hashCode() : 0;
        result = 31 * result + (user != null ? user.hashCode() : 0);
        result = 31 * result + (product != null ? product.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        temp = Double.doubleToLongBits(orderPrice);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (orderStatus != null ? orderStatus.hashCode() : 0);
        result = 31 * result + qty;
        result = 31 * result + (paymentMethod != null ? paymentMethod.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", user=" + user +
                ", product=" + product +
                ", date=" + date +
                ", orderPrice=" + orderPrice +
                ", orderStatus=" + orderStatus +
                ", qty=" + qty +
                ", paymentMethod=" + paymentMethod +
                '}';
    }
}
