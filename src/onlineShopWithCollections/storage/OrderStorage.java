package onlineShopWithCollections.storage;

import onlineShopWithCollections.enums.Answers;
import onlineShopWithCollections.enums.OrderStatus;
import onlineShopWithCollections.enums.PaymentMethod;
import onlineShopWithCollections.model.Order;
import onlineShopWithCollections.model.User;

import java.util.LinkedList;
import java.util.List;

public class OrderStorage {

    private List<Order> orders =new LinkedList<>();

    public void print(){
        for (Order order : orders) {
            System.out.println(order);
        }
    }


    public void printMyOrders(User user){
        for (Order myOrder : orders) {
            if (myOrder.getUser().equals(user)){
                System.out.println(myOrder);
            }
        }
    }

    public Order getOrderById(String id){
        for (Order order : orders) {
            if (order.getOrderId().equals(id)){
                return order;
            }
        }
        return null;
    }


    public void addOrders(Order order) {
        order.add(order);
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
