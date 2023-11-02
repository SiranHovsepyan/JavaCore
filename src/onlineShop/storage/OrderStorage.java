package onlineShop.storage;

import onlineShop.enums.PaymentMethod;
import onlineShop.model.Order;

public class OrderStorage {
    Order[] orders = new Order[10];
    int size;

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(orders[i]);
        }
    }
    private void extend() {
        Order[] tmp = new Order[orders.length + 10];
        System.arraycopy(orders, 0, tmp, 0, orders.length);
    }


    public void addOrders(Order order) {
        if (size == orders.length) {
            extend();
        }
        orders[size++] = order;
    }

    public PaymentMethod getType(String paymentType) {
        if (paymentType.equals(PaymentMethod.CARD.name()) ||
                paymentType.equals(PaymentMethod.CASH.name()) ||
                paymentType.equals(PaymentMethod.PAYPAL.name())) {
            return PaymentMethod.valueOf(paymentType);
        }
        return null;
    }
}
