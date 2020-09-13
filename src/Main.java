import cafe.Cafe;
import cafe.menu.*;
import cafe.personal.Barmen;
import cafe.personal.Cook;
import cafe.personal.IMakeFood;
import cafe.personal.Waiter;

import java.util.ArrayList;
import java.util.Arrays;

public class Main
{
    public static void main(String[] args) {
        MenuItem caesar = new MenuItem("Caesar", Category.STARTERS,true,2500.0);
        MenuItem lentilSoup = new MenuItem("Lentil Soup", Category.SOUPS,true,1000.0);
        MenuItem water = new MenuItem("Water", Category.DRINKS,true,250.0);
        Menu menu = new Menu(Arrays.asList(
            caesar,
            lentilSoup,
            water
        ));
        Cafe cafe = new Cafe(menu);
        menu.print();

        Cook cook = new Cook("shskj","aghgah",100000.0);
        Barmen barmen = new Barmen("khkjhkj","gjhgjh",80000.0);
        Waiter waiter = new Waiter("khjlk","dhddf",40970.0);

        Order order = new Order((short) 1, Arrays.asList(new OrderItem(caesar, (short)2)));
        order.getOrderItems().forEach(orderItem -> {
            System.out.println("Ordered Items " + orderItem.getCount()+" "+orderItem.getMenuItem().getName());
            if(orderItem.getMenuItem().getCategory().getCookType() == CookType.COOK) {

                cook.makeFood(orderItem.getMenuItem());
                cook.done(orderItem);
            }
            else {
                barmen.makeFood(orderItem.getMenuItem());
                barmen.done(orderItem);
            }
        });

        order.getOrderItems().forEach(orderItem -> {
            if(orderItem.getOrderItemState().equals(OrderItemState.DONE)) {
                waiter.serve(order);
            }

        });

    }
}
