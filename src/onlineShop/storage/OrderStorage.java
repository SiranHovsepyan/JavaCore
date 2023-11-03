package onlineShop.storage;

import onlineShop.enums.Answers;
import onlineShop.enums.OrderStatus;
import onlineShop.enums.PaymentMethod;
import onlineShop.model.Order;
import onlineShop.model.User;

public class OrderStorage {
    Order[] orders = new Order[10];
    int size;

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(orders[i]);
        }
    }

    public void printMyOrders(User user){
        for (int i = 0; i < size; i++) {
           if(orders[i].getUser().equals(user)){
               System.out.println(orders[i]);
           }
        }
    }

    public Order getOrderById(String id){
        for (int i = 0; i < size; i++) {
            if(orders[i].getOrderId().equals(id)){
               return orders[i];
            }
        }
        return null;
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

    public OrderStatus getOrderStatus(String orderStatus){
        if(orderStatus.equals(OrderStatus.NEW.name())||
                orderStatus.equals(OrderStatus.DELIVERED.name()) ||
                        orderStatus.equals(OrderStatus.CANCELED.name() )){
            return OrderStatus.valueOf(orderStatus);
        }
        return  null;
    }

    public Answers getAnswersType(String answersType) {
        if (answersType.equals(Answers.YES.name()) || answersType.equals(Answers.NO.name())) {
            return Answers.valueOf(answersType);
        }
        return null;
    }
}
