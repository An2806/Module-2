package storage;

import model.Menu;

import java.io.*;
import java.util.List;

public class FileManager {
    private static FileManager instance = new FileManager();

    public FileManager() {
    }

    public static synchronized FileManager getInstance() {
        if (instance == null) {
            instance = new FileManager();
        }
        return instance;
    }

    public synchronized void saveToCSV(List<Menu> items, String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (Menu item : items) {
                writer.write(item.toString());
                writer.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public synchronized void saveToBinary(List<Menu> items, String fileName) throws FileNotFoundException {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))) {
            out.writeObject(items);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
