package cafe.personal;

import cafe.menu.MenuItem;
import cafe.menu.OrderItem;
import cafe.menu.OrderItemState;

public class Cook extends Employee implements IMakeFood {

    public Cook(String firstName, String lastName, Double salary) {
        super(firstName, lastName, salary);
    }

    @Override
    public void makeFood(MenuItem menuItem) {
        System.out.println("Cook cooks "+menuItem.getName());
    }

    @Override
    public void done(OrderItem orderItem) {
        orderItem.setOrderItemState(OrderItemState.DONE);
    }
}
