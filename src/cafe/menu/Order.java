package cafe.menu;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private short tableNumber;
    private List<OrderItem> orderItems;
    private OrderStatus orderStatus;

    public Order(short tableNumber, List<OrderItem> orderItems) {
        this.tableNumber = tableNumber;
        this.orderItems = orderItems;
        this.orderStatus = OrderStatus.NEW;
    }

    public short getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(short tableNumber) {
        this.tableNumber = tableNumber;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }
}
