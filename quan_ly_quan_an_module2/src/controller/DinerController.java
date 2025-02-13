package controller;

import model.Menu;

import java.util.ArrayList;
import java.util.List;

public class DinerController {
    private List<Menu> menu = new ArrayList<>();


    public DinerController() {
    }

    public DinerController(List<Menu> menu) {
        this.menu = menu;
    }

    public void addMenu(String name, String size, double price) {
        try {
            int id = 0;
            menu.add(new Menu(id, name, size, price));
            System.out.println("Đã thêm món: " + name);
        } catch (IllegalArgumentException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }

    public void displayMenu() {
        if (menu.isEmpty()) {
            System.out.println("Danh sách món ăn trống.");
        } else {
            System.out.println("\n--- DANH SÁCH MÓN ĂN / ĐỒ UỐNG ---");
            for (Menu item : menu) {
                System.out.println(item);
            }
        }
    }

    public void searchMenuByName(String name) {
        boolean found = false;
        for (Menu item : menu) {
            if (item.getName().equalsIgnoreCase(name)) {
                System.out.println(item);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy món ăn nào có tên: " + name);
        }
    }
    public double calculateTotalRevenue() {
        double total = 0;
        for (Menu item : menu) {
            total += item.getPrice();
        }
        return total;
    }

    public void saveMenuToCSV(String csvFile) {
    }

    public void saveMenuToToBinary(String binaryFile) {

    }
}