package cafe.menu;

public enum Category {
    STARTERS("Starters", CookType.COOK, (byte)1),
    DRINKS("Drinks", CookType.BARMEN, (byte)5),
    MEALS("Meals", CookType.COOK, (byte)3),
    SOUPS("Soups", CookType.COOK, (byte)2),
    DESERTS("Deserts", CookType.COOK, (byte)4);

    private final String name;
    private final CookType cookType;
    private final byte position;
    Category(String name,CookType cookType, byte position) {
        this.name = name;
        this.cookType = cookType;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public CookType getCookType() {
        return cookType;
    }

    public short getPosition() {
        return position;
    }

}
