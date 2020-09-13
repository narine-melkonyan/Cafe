package cafe.personal;

import cafe.menu.Order;
import cafe.menu.OrderStatus;

public class Waiter extends Employee{

    public Waiter(String firstName, String lastName, Double salary) {
        super(firstName, lastName, salary);
    }
    public void serve(Order order){
        order.setOrderStatus(OrderStatus.SERVED);
        System.out.println("Served");
    }
}
