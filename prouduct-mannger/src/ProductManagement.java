

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductManagement {

    public static void writeProductToFile(List<Product> products, String path) {

        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.close();
            fos.close();

        } catch (IOException e){
            System.out.print(e.getMessage());
        }

    }

    public static List<Product> readProductFromFile(String path) {
        List<Product> products = new ArrayList<Product>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (List<Product>) ois.readObject();
            ois.close();
            fis.close();

        } catch (IOException e){
            System.out.print(e.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return products;
    }
    public static void main(String[] args) {
        List<Product> products = new ArrayList<Product>();

        products.add(new Product(1,"Food",50,"Pizza"));
        products.add(new Product(2,"Water",70,"Coca"));
        products.add(new Product(3,"Fruit",100,"Orange"));

        String path = "products.txt";
        writeProductToFile(products,  path);

        List<Product> readProducts = readProductFromFile(path);

        for (Product product : readProducts) {
            System.out.print(product.toString() + "\n");
        }

    }
}