package cafe.personal;

import cafe.menu.MenuItem;
import cafe.menu.OrderItem;
import cafe.menu.OrderItemState;
import cafe.menu.OrderStatus;

public interface IMakeFood {
    void makeFood(MenuItem menuItem);
    void done(OrderItem orderItem );
}
