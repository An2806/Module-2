package storage.factory;

import model.Food;

public class MenuFactory {
    private static MenuFactory instance;

    private MenuFactory() {}

    public synchronized static MenuFactory getInstance() {
        if (instance == null) {
            instance = new MenuFactory();
        }
        return instance;
    }

    public Food createMenu(String id) {
        switch (id) {
            case "Food":
                return new Food();
            case "Drink":
//                return new Drink();
            default:
                throw new IllegalArgumentException("Invalid menu id");
        }
    }
}