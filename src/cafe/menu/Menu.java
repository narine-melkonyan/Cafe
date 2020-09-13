package cafe.menu;

import java.util.*;

public class Menu {
    private List<MenuItem> menuItems;

    public Menu(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }
    public void print(){
        System.out.println("****************Menu****************");
        Map<Category,List<MenuItem>> groups = new HashMap<>();
        menuItems.forEach((menuItem -> {
            if (groups.containsKey(menuItem.getCategory())) {
                groups.get(menuItem.getCategory()).add(menuItem);
            } else {
                groups.put(menuItem.getCategory(), Arrays.asList(menuItem));
            }
        }));
        groups.keySet().stream().sorted( new Comparator<Category>() {
            @Override
            public int compare(Category o1, Category o2) {
                return o1.getPosition()-o2.getPosition();
            }
        }).forEach((category -> {
            System.out.println("-------------"+ category.getName()+"--------------");
            groups.get(category).forEach((menuItem -> System.out.println("    "+ menuItem.getName())));
        }));

    }

}
