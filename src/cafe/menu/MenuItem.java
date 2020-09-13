package cafe.menu;

public class MenuItem {
    private String name;
    private Category category;
    private boolean isAvailable;
    private Double price;

    public MenuItem(String name, Category category, boolean isAvailable, Double price) {
        this.name = name;
        this.category = category;
        this.isAvailable = isAvailable;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
