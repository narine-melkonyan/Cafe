package cafe.personal;

import cafe.menu.*;

public class Barmen extends Employee implements IMakeFood {

    public Barmen(String firstName, String lastName, Double salary) {
        super(firstName, lastName, salary);
    }

    @Override
    public void makeFood(MenuItem menuItem) {
        System.out.println("Barmen makes cocktail ");
    }

    @Override
    public void done(OrderItem orderItem) {
        orderItem.setOrderItemState(OrderItemState.DONE);
    }
}
