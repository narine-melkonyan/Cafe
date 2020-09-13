package cafe.menu;

public class OrderItem {
    private MenuItem menuItem;
    private short count;
    private OrderItemState orderItemState;


    public OrderItem(MenuItem menuItem, short count) {
        this.menuItem = menuItem;
        this.count = count;
    }

    public MenuItem getMenuItem() {
        return menuItem;
    }

    public void setMenuItem(MenuItem menuItem) {
        this.menuItem = menuItem;
    }

    public short getCount() {
        return count;
    }

    public void setCount(short count) {
        this.count = count;
    }

    public OrderItemState getOrderItemState() {
        return orderItemState;
    }

    public void setOrderItemState(OrderItemState orderItemState) {
        this.orderItemState = orderItemState;
    }
}
